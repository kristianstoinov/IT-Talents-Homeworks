import java.util.Scanner;


public class SeamanChess {

	
	static char[][] createTable(){
		char[][] board=new char[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				board[i][j]='0';
			}
		}
		return board;
		
	}
	
	
	static void printBoard(char[][] board){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	static char player1Move(char[][] board){
		Scanner sc = new Scanner(System.in);
	System.out.println("Please select coordinates to put X on: ");
	int coX=sc.nextInt();
	System.out.println("Next coordinate:");
	int coY=sc.nextInt();
	if(board[coX-1][coY-1]!='0'){
		System.out.println("Invalid coordinates!");
		return player1Move(board);
	}else{
		board[coX-1][coY-1]='X';
		return board[coX-1][coY-1];
	}
	}
	
	
	static char player2Move(char[][] board){
		Scanner sc = new Scanner(System.in);
	System.out.println("Please select coordinates to put O on: ");
	int coX=sc.nextInt();
	System.out.println("Next coordinate:");
	int coY=sc.nextInt();
	if(board[coX-1][coY-1]!='0'){
		System.out.println("Invalid coordinates!");
		return player2Move(board);
	}else{
		board[coX-1][coY-1]='O';
		return board[coX-1][coY-1];
	}
	}
	
	
	static boolean isGameWon(char[][] board){
		if(board[0][0]==board[1][1] && (board[0][0]=='X' || board[0][0]=='O')){
			if(board[1][1]==board[2][2]){
				return true;
			}
		}
		if(board[0][0]==board[0][1] && (board[0][0]=='X' || board[0][0]=='O')){
			if(board[0][1]==board[0][2]){
				return true;
			}
		}
		if(board[0][0]==board[1][0] && (board[0][0]=='X' || board[0][0]=='O')){
			if(board[1][0]==board[2][0]){
				return true;
			}
		}
		if(board[2][0]==board[2][1] && (board[2][0]=='X' || board[2][0]=='O')){
			if(board[2][1]==board[2][2]){
				return true;
			}
		}
		if(board[0][2]==board[1][2] && (board[0][2]=='X' || board[0][2]=='O')){
			if(board[1][2]==board[2][2]){
				return true;
			}
		}else{
			return false;
		}
		
		return false;
		
		
		
	}
	
	
//	static boolean endGame(char[][] board){
//		int flag=0;
//		for(int i=0;i<3;i++){
//			for(int j=0;j<3;j++){
//				if(board[i][j]!='0'){
//					flag=0;
//				}else{
//					flag=1;
//				}
//			}
//		}
//		
//		if(flag==0){
//			System.out.println("No one won this game! ");
//			return true;
//		}
//		else{
//			return false;
//		}
//	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] chessBoard=createTable();
		printBoard(chessBoard);
		boolean gameWon=false;
		boolean player1Won=false;
		boolean player2Won=false;
		int counterMoves=0;
		System.out.println("Let the game commense!");

		while(gameWon==false ){
			
			gameWon=isGameWon(chessBoard);
			if(gameWon==true){
				player2Won=true;
				break;
			}
//			endGameCheck=endGame(chessBoard);
//			if(endGameCheck==true){
//				break;
//			}
			printBoard(chessBoard);
			player1Move(chessBoard);
		counterMoves++;
			gameWon=isGameWon(chessBoard);
			if(gameWon==true){
				player1Won=true;
				break;
			}
			if(counterMoves==9){
				break;
			}
//			endGameCheck=endGame(chessBoard);
//			if(endGameCheck==true){
//				break;
//			}
			printBoard(chessBoard);
			player2Move(chessBoard);
			counterMoves++;
			if(counterMoves==9){
				break;
			}
			
			
		}
		if(player1Won==true){
			System.out.println("Congrats, Player 1 , you've won the game!");
		}else if(player2Won==true){
			System.out.println("Congrats, Player 2 , you've won the game!");
		}else{
			System.out.println("No one won this game!");
		}
		

	}

}

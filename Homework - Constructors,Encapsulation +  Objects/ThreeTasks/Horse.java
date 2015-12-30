public class Horse {
	public static char[][] horseMoves(int N, int M, int x, int y) {
		if (N > 0 && M > 0 && x >= 0 && y >= 0) {
			char[][] table = new char[N][M];
			if (isInTable(table, x, y)) {
				table[x][y] = 'h';
				pointing(table, x, y);
			} else {
				System.out.println("konq ne e na duskata");
			}
			return table;
		} else {
			System.out.println("not a table ");
			return new char[0][0];
		}

	}

	public static boolean isInTable(char[][] table, int x, int y) {
		if (x < table.length && y < table[0].length && x >= 0 && y >= 0) {
			return true;
		}
		return false;
	}

	static final int[][] posibleMoves = new int[][] { { 0, 1, 0, 1, 0 }, { 1, 0, 0, 0, 1 }, { 0, 0, -2, 0, 0 },
			{ 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0 } };

	public static void pointing(char[][] table, int x, int y) {
		for (int i = 0; i < posibleMoves.length; i++) {
			for (int j = 0; j < posibleMoves[0].length; j++) {
				if (posibleMoves[i][j] == 1) {
					int pointx = x + i - 2;
					int pointy = y + j - 2;
					if (isInTable(table, pointx, pointy)) {
						if (table[pointx][pointy] != '.') {
							table[pointx][pointy] = '.';
							pointing(table, pointx, pointy);
						}
					}
				}
			}

		}

	}

	public static void print(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int N = 3, M = 3, x = 1, y = 2;
		char[][] table = horseMoves(N, M, x, y);
		print(table);

	}

}
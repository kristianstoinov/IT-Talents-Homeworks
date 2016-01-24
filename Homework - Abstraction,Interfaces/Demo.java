import java.io.ObjectInputStream.GetField;

public class Demo {

	public static void main(String[] args) {
		int days=1;
		
		//My Frankenstein is finally  ALIVE!
		
		
		Employee maria = new Employee("Maria");
		
		Employee pena = new Employee("Pena");
		
		Employee gena = new Employee("Genka");
		
		Employee pesho=new Employee("Pesho");
		

		AllWork allwork = new AllWork();
		maria.setAllwork(allwork);
		pena.setAllwork(allwork);
		gena.setAllwork(allwork);
		pesho.setAllwork(allwork);
		allwork.addTask(new Task("Write code", 14));
		allwork.addTask(new Task("Twerk", 7));
		allwork.addTask(new Task("Play Dota", 4));
		allwork.addTask(new Task("Actually do some work", 8));
		allwork.addTask(new Task("Whatever", 10));
		allwork.addTask(new Task("Order pizza", 2));
		allwork.addTask(new Task("Ask for promotion", 12));
		allwork.addTask(new Task("Get rejected", 5));
		allwork.addTask(new Task("Swallow sadness", 13));
		allwork.addTask(new Task("Drink coffee", 3));
		allwork.addTask(new Task("Hibernate", 8));

		
allwork.setCurrentUnassignedTask(0);
		
		
		
		
		while(!allwork.isAllWorkDone()){
			System.out.println("\nLets start the " + days + " day\n");
			maria.work();
			pena.work();
			gena.work();
			pesho.work();
			days++;
			
			
		}
		
		
	}

}

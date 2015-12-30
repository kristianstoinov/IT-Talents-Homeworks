public class ComputerDemo {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		Computer comp3 = new Computer(2010, 1690, 800, 700);
		Computer comp4 = new Computer(2013, 2400, true, 1000, 900, "Linux");
		comp1.year = 2009;
		comp1.price = 2054;
		comp1.hardDiskMemory = 500;
		comp1.freeMemory = 450;
		comp1.isNotebook = true;
		comp1.operationSystem = "Linux";

		comp2.year = 2012;
		comp2.price = 2670;
		comp2.hardDiskMemory = 1000;
		comp2.freeMemory = 890;
		comp2.operationSystem = "Windows";

		comp2.useMemory(100);
		comp1.changeOperationSystem("Windows");

		System.out.println(comp1.year);
		System.out.println(comp1.price);
		System.out.println(comp1.hardDiskMemory);
		System.out.println(comp1.freeMemory);
		System.out.println(comp1.isNotebook);
		System.out.println(comp1.operationSystem);

		System.out.println();
		System.out.println(comp2.year);
		System.out.println(comp2.price);
		System.out.println(comp2.hardDiskMemory);
		System.out.println(comp2.freeMemory);

		System.out.println(comp2.operationSystem);

		int result =comp4.comparePrice(comp2);
		if(result==-1){
			System.out.println( comp4 + " is more expensive than " + comp2);
		}else if(result==1){
			System.out.println( comp2 + " is more expensive than " + comp4);
		}else{
			System.out.println("The two are of equal value.");
		}
		
		
		
		
		
		
	}

}

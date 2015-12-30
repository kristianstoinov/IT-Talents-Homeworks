public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if (memory < freeMemory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory!");
		}
	}
	
	public Computer(){
		this.isNotebook=false;
		this.operationSystem="Win XP";
	}
	
	public Computer(int year,double price,double hardDiskMemory,double freeMemory){
		this();
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
	}

	public Computer(int year,double price,boolean isNotebook,double hardDiskMemory,double freeMemory,String operationSystem){
		this.isNotebook=isNotebook;
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
		this.operationSystem=operationSystem;
	}
	
	int comparePrice(Computer c){
		if(this.price>c.price){
			return -1;
		}else if(this.price<c.price){
			return 1;
		}else{
			return 0;
		}
	}
	

}


public class Demo {

	public static void main(String[] args) {
	Task task1=new Task();
	Employee maria=new Employee("Maria");
	maria.setCurrentTask(task1);
	maria.work();
		
//	System.out.println(task1.getWorkingHours());
//System.out.println(maria.getHoursLeft());
	}

}

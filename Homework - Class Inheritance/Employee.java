
public class Employee extends Person{

	private int daySalary;
	
	
	public Employee(String name, int age, boolean isMale,int daySalary) {
		super(name, age, isMale);
		if(name!=null && age>0 && daySalary>0){
			this.daySalary=daySalary;
			
		}
	}
		
		public double calculateOvertime(double hours){
			if(daySalary!=0){
				if(getAge()<18){
					return 0.0;
				}else{
					return hours*(daySalary/8)*1.5;
				}
				
			}else{
				return 0.0;
			}
		}
		
		
		public void showEmployeeInfo(){
			showPersonInfo();
			System.out.println("Salary per day: "+ daySalary);
		}
			
			
			
			
			
			
		
}

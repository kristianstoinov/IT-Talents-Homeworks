
public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	private String sex;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isMale() {
		return isMale;
	}


	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}


	
	
	public Person(String name,int age,boolean isMale){
		if(name!=null && age>0){
		this.name=name;
		this.age=age;
		this.isMale=isMale;
		}
	}
	
	
	void showPersonInfo(){
		System.out.println("\nName: " + this.name);
		System.out.println("Age: " + this.age);
		if(isMale==true){
			sex="Male";
		}else{
			sex="Female";
		}
			System.out.println("Sex: "+ sex );
		
	}
	
	

}

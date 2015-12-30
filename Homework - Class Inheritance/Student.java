
public class Student extends Person{
 double score;
	

	
	
	public Student(String name, int age, boolean isMale,double score) {
		super(name, age, isMale);
if(name!=null && age>0 && score>=2 && score<=6){
		this.score=score;
}
	}

	public void showStudentInfo(){
		showPersonInfo();
		System.out.println("Score: " + score);
		
	}
	
	
	
	
}

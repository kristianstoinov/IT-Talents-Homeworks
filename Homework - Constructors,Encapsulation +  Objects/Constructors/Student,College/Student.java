
public class Student {

	private String name;
	String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		this.yearInCollege = yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	
	
	public Student(){
		this.grade=4.0;
		this.yearInCollege=1;
		this.isDegree=false;
		this.money=0;
	}
	
	public Student(String name,String subject,int age){
		this();
		this.name=name;
		this.subject=subject;
		this.age=age;
	}
	
	
	public void upYear(){
		if(isDegree==false){
			yearInCollege++;
		}else{
			System.out.println("This student has already graduated!");
		}
		if(yearInCollege==4){
			isDegree=true;
		}
	}
	public double receiveScholarship(double min,double amount){
		if(this.grade>=min && this.age<30){
		return this.money+=amount;
		}else{
			return money;
		}
	}
	
	
}

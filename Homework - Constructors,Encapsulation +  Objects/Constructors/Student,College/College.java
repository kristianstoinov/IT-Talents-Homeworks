
public class College {

	public static void main(String[] args) {
	
		Student kiro = new Student("Kiro", "Auto", 21);
		Student gosho = new Student("Gosho","Auto",20);
		Student plamen = new Student("Plamen","Auto",40);
		Student angel=new Student("Achkata","KSI",21);
		Student chris = new Student("Chris","KSI",21);
		Student michael=new Student("Misho","EE",22);
		
		
		StudentGroup class1=new StudentGroup("KSI");
		StudentGroup class2=new StudentGroup("EE");
		StudentGroup class3=new StudentGroup("Auto");
		
		
		class1.addStudent(chris);
		class1.addStudent(angel);
		
		class2.addStudent(michael);
		
		plamen.setGrade(2.95);
		gosho.setGrade(4.25);
		kiro.setGrade(3.40);
		
		
		
		class3.addStudent(plamen);
		class3.addStudent(gosho);
		class3.addStudent(kiro);
		
		System.out.println(class3.theBestStudent());
		
		
		chris.receiveScholarship(3.65, 200);
		plamen.receiveScholarship(3.25, 500);
		michael.upYear();
		kiro.upYear();
		
		
		
		
	}

}

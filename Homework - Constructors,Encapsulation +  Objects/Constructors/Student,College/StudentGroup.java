public class StudentGroup {

	private String groupSubject;
	private Student[] students = new Student[23];
	private int freePlaces;
	private Student s;
	
	private int count = 0;

	public StudentGroup() {
		students = new Student[5];
		this.freePlaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;

	}

	public void addStudent(Student s) {

		if (freePlaces > 0 && this.groupSubject.equalsIgnoreCase(s.subject)) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = s;
					freePlaces--;
					break;

				}
			}
		}else{
			System.out.println("Wrong group subject!");
		}
	}

	public void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public String theBestStudent() {
		double max = 0;
		for (int i = 0; i <= students.length - 1; i++) {
			if(students[i]!=null){
			if (students[i].getGrade() > max) {
				max = students[i].getGrade();
				count = i;
			}
		}else{
			continue;
		}
		}
		return students[count].getName();
	}

	public void printStudentsInGroup() {
		for (int i = 0; i <= students.length - 1; i++) {
			System.out.println(students[i].getName() + " "
					+ students[i].getAge() + " " + students[i].getGrade() + " "
					+ students[i].getMoney() + " " + students[i].getSubject()
					+ " " + students[i].getYearInCollege());

		}

	}

}

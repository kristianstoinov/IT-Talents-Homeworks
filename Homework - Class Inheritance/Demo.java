public class Demo {

	public static void main(String[] args) {

		Person[] people = new Person[10];

		Person maria = new Person("Maria", 28, false);
		Person pencho = new Person("Penata", 30, true);

		Student angel = new Student("Angel", 17, true, 5.28);
		Student chris = new Student("Christian", 16, true, 5.50);

		Employee gosho = new Employee("Gergi", 27, true, 100);
		Employee irina = new Employee("Irina", 26, false, 120);

		people[0] = maria;
		people[1] = pencho;
		people[2] = angel;
		people[3] = chris;
		people[4] = gosho;
		people[5] = irina;

		

		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Student) {
				((Student) people[i]).showStudentInfo();
			} else if (people[i] instanceof Employee) {
				((Employee) people[i]).showEmployeeInfo();
			}else if(people[i] instanceof Person){
				people[i].showPersonInfo();
			}
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Employee) {
				System.out.println("\nThe worker " + people[i].getName()
						+ " has earned - "
						+ ((Employee) people[i]).calculateOvertime(2));
			}
		}

	}

}

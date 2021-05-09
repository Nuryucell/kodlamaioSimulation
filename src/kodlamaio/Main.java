package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Nur", "Yucel", "nuryucel", "nuryucel@email.com", "*****", "Java+React");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "engindemirog", "engindemirog@email.com", "********", "1: Java + React" + "2: C# + Angular");
		

		StudentManager studentManager = new StudentManager();
		studentManager.addToStudent(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToInstructor(instructor1);
		
		UserManager userManager = new UserManager();
		User[] users = {student1, instructor1};
		userManager.addMultiple(users);
		
		

	}

}

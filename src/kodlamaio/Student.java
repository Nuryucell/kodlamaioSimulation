package kodlamaio;

public class Student extends User {

	private int studentId;
	private String registeredCourse;
	

	
	public Student( int studentId, String firstName, String lastName, String eMail, String userName, String password, String registeredCourse ) {
		super(firstName, lastName, eMail, userName, password);
		this.studentId = studentId;
		this.registeredCourse = registeredCourse;
	}
	


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getRegisteredCourse() {
		return registeredCourse;
	}
	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}
}

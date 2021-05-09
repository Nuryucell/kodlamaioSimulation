package kodlamaio;

public class Instructor extends User{
	
	private int instructorId;
	private String giveCourse;
	
	
	
	public Instructor(int instructorId, String firstName, String lastName, String eMail, String userName, String password, String giveCourse) {
		super(firstName, lastName, eMail, userName, password);
		this.instructorId = instructorId;
		this.giveCourse = giveCourse;
	}
	
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getGivecourse() {
		return giveCourse;
	}
	public void setGivecourse(String givecourse) {
		this.giveCourse = givecourse;
	}
	
	

}

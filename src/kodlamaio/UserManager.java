package kodlamaio;

public class UserManager {
	
	public void addUser (User user) {
		System.out.println(user.getUserName() + " " + user.getLastName() + " ad�na sahip kullan�c� eklendi.");
	}
	
	
	public void addMultiple(User[] user) {
		for (User users : user) {
			addUser(users);
		}

}
	
	
}

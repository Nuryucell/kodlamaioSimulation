package kodlamaio;

public class UserManager {
	
	public void addUser (User user) {
		System.out.println(user.getUserName() + " " + user.getLastName() + " adýna sahip kullanýcý eklendi.");
	}
	
	
	public void addMultiple(User[] user) {
		for (User users : user) {
			addUser(users);
		}

}
	
	
}

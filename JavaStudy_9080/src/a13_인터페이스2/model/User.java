package a13_인터페이스2.model;

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEamil(String email) {
		this.email = email;
	}
	public void showUser() {
		System.out.println("User[username= "+ username + ", password= " + password +", name= " + name + ", email= " + email + "]");
	}
	
}

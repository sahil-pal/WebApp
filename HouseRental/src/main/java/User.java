
public class User {

	
	private String firstname;
	private String lastname;
	private String UserID;
	private String phone;
	private String password;
	private String email;
	private String state;
	private String city;


	public User(String phone, String firstname, String lastname, String password,String UserID, String email, String state,String city) {
		super();
		this.phone = phone;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.UserID = UserID;
		this.email = email;
		this.state = state;
		this.city = city;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

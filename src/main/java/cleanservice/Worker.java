package cleanservice;

public class Worker {
	private String firstName;
    private String lastName;
    private String phone;
    private String password;
    private String username;
    
    public Worker(String firstName, String lastName, String email, String phone, String password, String username)
    {
    	this.firstName = firstName;
        this.lastName = lastName;
        this.username = email;
        this.phone = phone;
        this.password = password;
    	
    }
    
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassowrd() {
		return password;
	}
	public void setPassowrd(String passowrd) {
		this.password = passowrd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}

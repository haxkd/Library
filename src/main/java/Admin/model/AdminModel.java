package Admin.model;

public class AdminModel {
	String email;
	String password;
	public AdminModel(String email,String password) {
		this.email = email;		
		this.password = password;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
}

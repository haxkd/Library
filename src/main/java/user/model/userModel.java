package user.model;

public class userModel {
	String name;
	String email;
	String gender;
	String password;
	public userModel(String name,String email,String gender,String password) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
}

package Admin.model;

public class AdminPasswordModel {
	String Email;
	String OldPassword;
	String NewPassword;
	String ConfirmPassword;
	public AdminPasswordModel(String Email, String OldPassword,String NewPassword,String ConfirmPassword) {
		this.Email = Email;	
		this.OldPassword = OldPassword;		
		this.NewPassword = NewPassword;
		this.ConfirmPassword = ConfirmPassword;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getEmail() {
		return this.Email;
}
	
		
	public void setOldPassword(String OldPassword) {
		this.OldPassword = OldPassword;
	}
	
	public String getOldPassword() {
		return this.OldPassword;
	}
	
	
	public void setNewPassword(String NewPassword) {
		this.NewPassword = NewPassword;
	}
	public String getNewPassword() {
		return this.NewPassword;
	}
	public void setConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword = ConfirmPassword;
	}
	public String getConfirmPassword() {
		return this.ConfirmPassword;
	}
}

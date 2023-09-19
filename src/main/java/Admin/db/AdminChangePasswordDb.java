package Admin.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Admin.model.AdminPasswordModel;
public class AdminChangePasswordDb {

	
	public boolean checkOldPassword(AdminPasswordModel data){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
			String query = "SELECT * FROM admin WHERE AdminEmail=? and AdminPassword=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, data.getEmail());
			st.setString(2, data.getOldPassword());
			ResultSet set = st.executeQuery();
			return set.next();
			}
		catch(Exception e) {
				e.printStackTrace();
				return false;
		}
	}
	
	public int changePassword(AdminPasswordModel data){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
			
			String query = "UPDATE admin SET AdminPassword=? WHERE AdminEmail=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, data.getNewPassword());
			st.setString(2, data.getEmail());
				return st.executeUpdate();
			}
		catch(Exception e) {
				e.printStackTrace();
				return 0;
		}
	}
}

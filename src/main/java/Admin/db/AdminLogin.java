package Admin.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Admin.model.AdminModel;
public class AdminLogin {
	int i = 0;
	public int adminLog(AdminModel admindata) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
			String query = "SELECT * FROM admin WHERE AdminEmail=? and AdminPassword=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, admindata.getEmail());
			st.setString(2, admindata.getPassword());
			ResultSet set = st.executeQuery();
			if(set.next()) {
				i = 1;
			}			
		}
		catch(Exception e){
			System.out.print(e);
		}		
		return i;
	}	
}

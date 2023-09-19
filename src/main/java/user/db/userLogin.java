package user.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import user.model.userModel;

public class userLogin {
	int i = 0;
	public int userLog(userModel userdata) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
			String query = "SELECT * FROM users WHERE email=? and password=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, userdata.getEmail());
			st.setString(2, userdata.getPassword());
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

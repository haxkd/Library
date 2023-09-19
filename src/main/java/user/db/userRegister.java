package user.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import user.model.userModel;

public class userRegister {
//connection
	int i = 0;
	public int userReg(userModel userdata) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
			String query = "INSERT INTO users(name,email,gender,password) VALUES(?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, userdata.getName());
			st.setString(2, userdata.getEmail());
			st.setString(3, userdata.getGender());
			st.setString(4, userdata.getPassword());
			i = st.executeUpdate();
		}
		catch(Exception e){
			System.out.print(e);
		}		
		return i;
	}	
}

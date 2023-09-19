package Admin.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Admin.model.*;
public class BookDb {

	
	public int addBook(BookModel model) {
		int i = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");
			String query = "INSERT into books(BookName,BookPublisher,BookAuthor,BookImage) VALUES(?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, model.getBookName());
			st.setString(2,model.getBookPublisher());
			st.setString(3,model.getBookAuthor());
			st.setString(4,model.getBookImage());
			i = st.executeUpdate();						
		}
		catch(Exception e){
			System.out.print(e);
		}		
		return i;
	}
	
	
}

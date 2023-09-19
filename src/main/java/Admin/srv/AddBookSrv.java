package Admin.srv;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import Admin.db.*;
import Admin.model.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@MultipartConfig
@WebServlet("/AddBook")
public class AddBookSrv extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		
		String BookName = request.getParameter("BookName");		
		String BookPublisher = request.getParameter("BookPublisher");
		String BookAuthor = request.getParameter("BookAuthor");
		Part file=request.getPart("BookImage");
		String BookImage = 	file.getSubmittedFileName();
		
		BookModel model = new BookModel(BookName,BookPublisher,BookAuthor,BookImage);
		
		String UploadPath = "C:\\Users\\Haxkd\\eclipse-workspace\\TestProject\\src\\main\\webapp\\images\\"+BookImage;
		
		FileOutputStream fos=new FileOutputStream(UploadPath);
		InputStream is=file.getInputStream();
		byte[] pic=new byte[is.available()];
		is.read(pic);
		fos.write(pic);
		fos.close();
		
		
		BookDb obj = new BookDb();
		int x = obj.addBook(model);
		PrintWriter t  = response.getWriter();
		HttpSession sess=request.getSession();
		if(x>0) {
			sess.setAttribute("msg", "Book Added");
		}
		else {
			sess.setAttribute("msg","Book Not Added");			
		}
		response.sendRedirect("Admin/addBook.jsp");
	}
}

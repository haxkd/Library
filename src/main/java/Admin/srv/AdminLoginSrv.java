package Admin.srv;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import Admin.db.AdminLogin;
import Admin.model.AdminModel;
@WebServlet("/AdminLogin")
public class AdminLoginSrv extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		
		String email = request.getParameter("AdminEmail");		
		String password = request.getParameter("AdminPassword");
		
		AdminModel model = new AdminModel(email,password);
		
		AdminLogin obj = new AdminLogin();
		int x = obj.adminLog(model);
		PrintWriter t  = response.getWriter();
		HttpSession sess=request.getSession();
		if(x>0) {
			sess.setAttribute("AdminEmail", email);
			response.sendRedirect("Admin/addBook.jsp");
		}
		else {
			sess.setAttribute("msg","Admin Login failed");
			response.sendRedirect("Admin/login.jsp");
		}
	}
}

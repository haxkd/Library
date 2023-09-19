package user.srv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import user.db.userLogin;
import user.db.userRegister;
import user.model.userModel;

@WebServlet("/Login")
public class userLoginSrv extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		userModel model = new userModel("",email,"",password);
		
		userLogin obj = new userLogin();
		int x = obj.userLog(model);
		PrintWriter t  = response.getWriter();
		HttpSession sess=request.getSession();
		if(x>0) {
			sess.setAttribute("UserEmail", email);
			response.sendRedirect("dashboard.jsp");
		}
		else {
			
			
			sess.setAttribute("msg", "Login Failed");
			response.sendRedirect("login.jsp");
		}
	}
}

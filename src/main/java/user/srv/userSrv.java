package user.srv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import user.db.userRegister;
import user.model.userModel;

@WebServlet("/Register")
public class userSrv extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		
		userModel model = new userModel(name,email,gender,password);
		
		userRegister obj = new userRegister();
		int x = obj.userReg(model);
		PrintWriter t  = response.getWriter();
		if(x>0) {
			t.print("Regsiter Successfull");
		}
		else {
			t.print("regsiter failed");
		}
	}
	
	
	
}

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
import Admin.model.AdminPasswordModel;
import Admin.db.AdminChangePasswordDb;
@WebServlet("/ChangePassword")
public class AdminChangePassword extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		
		String OldPassword = request.getParameter("OldPassword");		
		String NewPassword = request.getParameter("NewPassword");
		String ConfirmPassword = request.getParameter("ConfirmPassword");
		
		HttpSession sess = request.getSession();
		String AdminEmail = (String)sess.getAttribute("AdminEmail");
		
		AdminPasswordModel model = new AdminPasswordModel(AdminEmail,OldPassword,NewPassword,ConfirmPassword);
		
		// check old password
		AdminChangePasswordDb db = new AdminChangePasswordDb();
		boolean check = db.checkOldPassword(model);
		if(check==true) {
			// check confirm==pass
			if(NewPassword.equals(ConfirmPassword)) {
				int i = db.changePassword(model);
				
				if(i>0) {
					sess.setAttribute("msg", "Password Updated Successfully");
					response.sendRedirect("Admin/dashboard.jsp");
				}
				else
				{
					sess.setAttribute("msg", "Password Updated Failed");
					response.sendRedirect("Admin/changePassword.jsp");
				}
			}
			else {
				sess.setAttribute("msg", "New Password and confirm password is not mathced");
				response.sendRedirect("Admin/changePassword.jsp");
			}
		}
		else {
			sess.setAttribute("msg", "Old Password is Wrong");
			response.sendRedirect("Admin/changePassword.jsp");
		}
		
		
		
	
	}

}

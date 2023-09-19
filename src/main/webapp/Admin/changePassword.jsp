 <%
String AdminEmail = (String)session.getAttribute("AdminEmail");
if(AdminEmail==null){
	 %>
	 <script>
	 
	 alert("Your are not authorised");
	 window.location.href = "login.jsp";
	 
	 </script>
	 <%
}
  
  String msg = (String)session.getAttribute("msg");
    
 
if(msg!=null){
	%>
<script>alert("<%=msg%>");</script>
	<%
	session.removeAttribute("msg");
}
%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="../ChangePassword">

Old Password : <input type="password" name="OldPassword"><br><br>

New Password : <input type="password" name="NewPassword"><br><br>

Confirm New Password : <input type="password" name="ConfirmPassword"><br><br>

<input type="submit" value="change">
</form>

</body>
</html>
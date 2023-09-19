 <%
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

<h1>Admin Login</h1>


<form action="../AdminLogin" method="POST">

Admin Email : <input type="email" name="AdminEmail">

Admin Password : <input type="password" name="AdminPassword">

<input type="submit" value="LOGIN">
</form>

</body>
</html>
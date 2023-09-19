 <%
  String msg = (String)session.getAttribute("msg");
    
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

<%

if(msg!=null){
	%>
<script>alert("<%=msg%>");</script>
	<%
	session.removeAttribute("msg");
}
%>



<h1>Login Page</h1>

<form action="Login" method="POST">

email : <input type="email" name="email"> <br><br>

Password : <input type="password" name="password"> <br><br>
<input type="submit" value="login">
</form>
</body>
</html>
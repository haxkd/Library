<%
  String UserEmail = (String)session.getAttribute("UserEmail");
 if(UserEmail==null){
	 %>
	 <script>
	 alert("Your are not authorised");
	 window.location.href = "login.jsp";
	 </script>
	 <%
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
<h1>dahboard page</h1>

<a href="Logout"><button>Log Out</button></a>

</body>
</html>
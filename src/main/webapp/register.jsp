<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>register page</h1>

<form action="Register" method="POST">
name : <input type="text" name="name"> <br><br>

email : <input type="email" name="email"> <br><br>

gender : <input type="radio" name="gender" value="male">Male 
	<input type="radio" name="gender" value="female">FeMale 
	<input type="radio" name="gender" value="other">Other   <br><br>

Password : <input type="password" name="password"> <br><br>
<input type="submit" value="register">
</form>

</body>
</html>
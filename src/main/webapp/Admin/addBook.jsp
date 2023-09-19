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
<h1>Add A new Book</h1>

<form method="POST" action="../AddBook" enctype="multipart/form-data">
Book Name : <input type="text" name="BookName"> <br><br>
Book Publisher : <input type="text" name="BookPublisher"> <br><br>
Book Author : <input type="text" name="BookAuthor"> <br><br>
Book Image : <input type="file" name="BookImage"> <br><br>
<input type="submit" value="Store">
</form>


</body>
</html>
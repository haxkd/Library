
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

	<h1>All Books</h1>

</body>
</html>
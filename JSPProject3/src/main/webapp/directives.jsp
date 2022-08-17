<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String email,password; %>
<%
email=request.getParameter("email");
password=request.getParameter("password");
if(email.equals("sreeja@gmail.com")&&password.equals("123")){
	out.println("login success");
%>
<jsp:forward page="home.jsp"></jsp:forward>
<% 
}
else{
	out.println("Please enter corrrect credentials");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
}
%>
</body>
</html>
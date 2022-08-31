<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
${requestScope.obj}
<body>
<h2>Retrieving Data</h2>
<form action="signIn" method="post">
<label>email</label>
<input type="email" name="email"><br/>
<label>password</label>
<input type="password" name="password"><br/>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
<br/>
<a href="signUp.jsp">Update Data</a>
</body>
</html>
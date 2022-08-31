<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductController "method="post">
<label>Product Id</label>
<input type="number" name="id">
<label>Product Name</label>
<input type="text" name="pname">
<label>Product Price</label>
<input type="number" name="pprice">
<input type="submit" value="submit">
<input type="reset" name="reset">
</form>
</body>
</html>
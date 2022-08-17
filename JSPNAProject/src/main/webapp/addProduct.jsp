<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.bean.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int id;%>
<%! String pname;%>
<%! float pprice; %>
<%
id=Integer.parseInt(request.getParameter("id"));
pname=(String)request.getParameter("pname");
pprice=Float.parseFloat(request.getParameter("price"));
Product p=new Product();
p.setId(id);
p.setPname(pname);
p.setPprice(pprice);
List<Product> listOfProduct;
Object obj = session.getAttribute("obj");
if(obj==null){
	listOfProduct = new ArrayList<Product>();
	
	listOfProduct.add(p);
	session.setAttribute("obj", listOfProduct);
}else {
	
	listOfProduct = (List<Product>)session.getAttribute("obj");
	listOfProduct.add(p);
	for(Product s:listOfProduct){
		out.println(s+"<br/>");
	}
}
%>
<%@include file="index.jsp" %>
</body>
</html>
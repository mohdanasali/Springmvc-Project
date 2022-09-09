<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="springmvc1.Model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucess Page</title>
<h1>This is View Page</h1>
</head>
<body>
<%
User user = (User)request.getAttribute("user");
String username=(String)request.getAttribute("username");
String password=(String)request.getAttribute("password");
%>
<h1><%=user%>
<br>
<%=username %>
<br>
<%=password %>
</h1>
</body>
</html>
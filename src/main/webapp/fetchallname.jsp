<%@page import="java.util.List"%>
<%@page import="dto.details"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<details> list=(List<details>)request.getAttribute("list"); %>
<table border='1'>
<tr>
<th>id</th>
<th>Name</th>
<th>mobile</th>
<th>email</th>
</tr>
<%for(details detail:list){ %>
<tr>
<th><%=detail.getId() %></th>
<th><%=detail.getName() %></th>
<th><%=detail.getMobile()%></th>
<th><%=detail.getEmailid()%></th>
</tr>
<% }%>
</table>
<a href="Home.html"><button>HOME</button></a>
</body>
</html>
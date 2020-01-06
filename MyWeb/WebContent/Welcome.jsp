<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="MyWeb.css"/>
<body>
<%
 response.setHeader("Pragma", "no-cache");

if(session.getAttribute("user")==null)
	response.sendRedirect("LoginPage.jsp");

%>
<h1 id="field">hi ${message} you have succesfully loged in </h1> 
<table >
<tr><td>
<form action="logout" method="post"><button type="submit" name="logout" >Logout</button></form>
</td></tr>
</table>
</body>
</html>
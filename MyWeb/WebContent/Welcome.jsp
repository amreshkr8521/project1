<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="MyWeb.css"/>

<%
String user=null;
if(session.getAttribute("user")==null){
	response.sendRedirect("Loginpage.jsp");
}else 
	user=session.getAttribute("user").toString();	
	
%>
<body>

<h1 id="field">hi ${message} you have succesfully loged in </h1> 
<table >
<tr><td>
<form action="logout" method="post"><button type="submit" name="logout" >Logout</button></form>
</td></tr>
</table>
</body>
</html>
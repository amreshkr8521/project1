<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<jsp:include page="MyWeb.css"/>



<body>
 <form action="Login" method="post"><fieldset><div id="field">
 <h1>Login </h1>
 <h1 id="h1"> ${message1} ${ADDED_IN_DATABASE} </h1></div> 
 <table><tr><td>
 Email </td><td><input type="text" placeholder="abc@gmail.com" name="userId" required="required"><br></td></tr>
 <tr><td>password</td><td> <input type="password" name="pwd" required="required"></td></tr>
 <tr>
 <td></td>
 <td><button id="login" type="submit" name="submit" >Log in</button></td>
 </tr>
</table>
<a href="SignUP.jsp"> Register</a>
</fieldset></form>

<form action="forgot_passsword" method="post">
<a href="forgotPassword.jsp">Forgot Password</a>
</form>
</body>
</html>
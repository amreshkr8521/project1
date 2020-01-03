<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<style>
a:hover {
	color :red
}
	  body  {
            background-image: url("images.jpeg");
           
             
 			 height: 100%; 
 			 background-position: center;
 			 background-repeat: no-repeat;
  			background-size: cover;
         }         
  #field{
   height: 100px;
            background: -webkit-linear-gradient(left, red , blue);
            background: -o-linear-gradient(right, red, blue); 
            background: -moz-linear-gradient(right, red, blue);
            background: linear-gradient(to right, red , blue);
  }       
</style>
<body>
 <form action="Login" method="post"><fieldset><div id="field">
 <h1>Login ${message1} ${ADDED_IN_DATABASE}</h1></div> 
 <table><tr><td>
 Email </td><td><input type="text" placeholder="abc@gmail.com" name="userId"><br></td></tr>
 <tr><td>password</td><td> <input type="password" name="pwd"></td></tr>
 <tr>
 <td></td>
 <td><button id="login" type="submit" name="submit">Log in</button></td>
 </tr>
</table>
<a href="SignUP.jsp"> Register</a>
</fieldset></form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
a:hover {
	color :red
}
	  body  {
            background-image: url("/home/user/Downloads/images.jpeg");
            background-color: #cccccc;
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
 <form action="Login" method="get"><fieldset><div id="field">
 <h1>Login</h1></div>
 
 <table><tr><td>
 Login Id </td><td><input type="text" value="name" name="userId"><br></td></tr>
 <tr><td>password</td><td> <input type="text" name="pwd"></td></tr>
 <tr>
 <td></td>
 <td><button id="login" type="button" >Log in</button></td>
 </tr>
</table>
<a href="SignUP.jsp"> Register</a>
</fieldset></form>
</body>
</html>
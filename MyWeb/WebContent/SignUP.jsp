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
<body >
<form action="SignUp" method="post"><div id="field">
<fieldset id="f1">


<h1 id="h1">Register ${warning1} ${warning} </h1>
<h1 id="h1">${DATABASE_WARNING} ${ADDED_IN_DATABASE}</h1>

<br>
First Name<br>
<input type="text" placeholder="FirstName" name="FirstName" required="required"><br>
<br>
Last Name<br>
<input type="text" placeholder="LastName" name="LastName"><br><br>
email<br>
<input type="text" placeholder="abc@gmail.com" name="email" required="required"><br><br>
Mobile no.<br>
<input type="text" placeholder="9874563210" name="mobile" required="required"><br><br>
<input type="radio" value="Male" name="gender" >Male<input type="radio" value="Male" name="gender"> Female<br><br>
Password<br>
<input type="password" name="password" required="required"><br><br>
Re-type password<br>
<input type="password" name="rePassword" required="required"><br><br>
<input id="SignUp" type="submit" name="submit">
</fieldset>
</div>
</form>
</body>
</html>
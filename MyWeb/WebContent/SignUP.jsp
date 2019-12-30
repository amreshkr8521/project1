<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
#field{  height: 100px;
            background: -webkit-linear-gradient(left, red , blue);
            background: -o-linear-gradient(right, red, blue); 
            background: -moz-linear-gradient(right, red, blue);
            background: linear-gradient(to right, red , blue);
}
body{ background-color: #cccccc;}

#hi{background-color:blue}
</style>
<body >
<form action=""><div id="field">
<fieldset >

<h1 id="h1">Register</h1><br>
First Name<br>
<input type="text" value="FirstName"><br>
<br>
Last Name<br>
<input type="text" value="LastName"><br><br>
email<br>
<input type="text" value="abc@gmail.com"><br><br>
Mobile no.<br>
<input type="text" value="9874563210"><br><br>
<input type="radio" value="Male" >Male<input type="radio" value="Male"> Female<br><br>
Password<br>
<input type="password"><br><br>
Re-type password<br>
<input type="password"><br><br>
<input type="submit" value="Sign Up">
</fieldset>
</div>
</form>
</body>
</html>
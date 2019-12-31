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
 body  {
           
            background-color: #cccccc;
         } 
</style>
<body>
<h1 id="field">hi ${message} you have succesfully loged in </h1> 
<table border="black">
<tr><td> <button id="Details" name="details" type="submit" value="your details">your details</button></td></tr>
<tr><td><button type="submit" name="show" >Edit</button></td></tr>
</table>
</body>
</html>
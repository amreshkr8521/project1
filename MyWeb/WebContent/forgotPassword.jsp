<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="forgot" method="post">
		<fieldset>

			<table>
				<tr>
					<td>Email :</td>
					<td><input type="text" placeholder="abc@gmail.com"
						name="email"></td>
				</tr>
				<tr>
					<td>mobile no. :</td>
					<td><input type="text" placeholder="7894561230" name="mobile"></td>
				</tr>
				<tr>
					<td>New Password :</td>
					<td><input type="password" placeholder="7894561230"
						name="password"></td>
				</tr>
				<tr>
					<td>Re-type Password :</td>
					<td><input type="password" placeholder="7894561230"
						name="RePassword"></td>
				</tr>

			</table>
			<button id="forgotPassword" type="submit" name="forgot">reset</button>
		</fieldset>
	</form>
</body>
</html>
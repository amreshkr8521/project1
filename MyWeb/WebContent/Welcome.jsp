<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="MyWeb.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	height: 50px;
	width: 15%;
	background-color: powderblue;
}

th, td {
	padding: 5px;
	text-align: left;
}
</style>
<body>
	<%
		response.setHeader("Pragma", "no-cache");

		if (session.getAttribute("user") == null)
			response.sendRedirect("LoginPage.jsp");
	%>
	<h3 id="field">hi ${message} you have succesfully loged in</h3>
	<table>
		<tr>
			<td>
				<form action="logout" method="post">
					<button type="submit" name="logout">Logout</button>
				</form>
			</td>
		</tr>
	</table>

	<table>
		<tr>
			<td>View Graph <br>
				<form action="Graph" method="get">
					<select id="graph">
						<option value="age">Age</option>
						<option value="location">Location</option>
					</select>

					<button type="submit" name="Graph">Check</button>
				</form></td>
		</tr>
		<tr>
			<td>View Gender <br>
				<form action="Gender" method="get">
					<select id="option">
						<optgroup label="gender">
							<option value="Male">Male</option>
							<option value="Female">female</option>
						</optgroup>
					</select>
					<button type="submit" name="Gender">Check</button>
				</form>
			</td>
		</tr>
		<tr>
			<td><form action="history" method="get">
					Reg-history
					<button type="submit" name="history">Check</button>
				</form></td>
		</tr>
	</table>
</body>
</html>
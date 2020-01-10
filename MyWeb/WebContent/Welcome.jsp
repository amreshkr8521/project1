<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
#header1 {
	height: 50px;
	width: 100%;
	background-color: powderblue;
}

#header2 {
	height: 50px;
	width: 100%;
	background-color: lightBlue;
}

#sideBar {
	height: 500px;
	width: auto;
	background-color: LightGray;
}

body {
	background-image: url("images.jpeg");
	height: 100%;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

h1 {
	color: white;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	/*$(document).ready(function() {
		$("#location").click(function() {
			$.get('test.html',function(data,status)
					{
						$('#ShowData').html();
						alert(status);
					});
		});*/
		$(document).ready(function() {
			$("#age").click(function() {
				$.get('test.html',function(data,status)
						{
							$('#ShowData').html(data);

						});
			});
		$("#location").click(function() {
			var data = "Location" + "location";
			$.ajax({
				url : "Graph",
				data :data,
				type : 'get',
				success : function(data,status) {
					$('#ShowData').html(data);

				}
			});
		});

		$("#male").click(function() {
			var data = "male" + "male";
			$.ajax({
				url : "male",
				data :data,
				type : 'get',
				success : function(data,status) {
					$('#ShowData').html(data);

				}
			});
		});

		$("#female").click(function() {
			var data = "female" + "female";
			$.ajax({
				url : "Female",
				data :data,
				type : 'get',
				success : function(data,status) {
					$('#ShowData').html(data);

				}
			});
		});
	});


</script>
<body>
	<%
		response.setHeader("Pragma", "no-cache");
		if (session.getAttribute("user") == null)
			response.sendRedirect("LoginPage.jsp");
	%>
	<div class="row">
		<div class="col-sm-1">
			<div>logo</div>
		</div>
		<div class="col-sm-10">
			<div id="header2">
				<h3>hi ${message} you have succesfully loged in</h3>
			</div>
		</div>
		<form action="logout" method="post">
			<div class="col-sm-1">
				<div>
					<button type="submit" class="btn btn-primary btn-block">Logout</button>
				</div>
			</div>
		</form>
	</div>
	<div class="row">
		<div class="col-sm-2">
			<div id="sideBar">
				<div class="btn-group-vertical">
					<div>
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle btn-block btnclick"
								type="button" data-toggle="dropdown" id="graph">
								GRAPH <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<li id="age">age</li>
								<li id="location">location</li>
							</ul>
						</div>
					</div>
					<div>
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle btn-block"
								type="button" data-toggle="dropdown">
								Gender <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<li id="male">Male</li>
								<li id="female">Female</li>
							</ul>
						</div>

						<div>
							<button class="btn btn-primary dropdown-toggle btn-block"
								type="button" data-toggle="dropdown">REGISTRATION
								HISTORY</button>
							<ul class="dropdown-menu">
								<li><a href="">history</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-8" id="ShowData">

		</div>
	</div>



</body>
</html>

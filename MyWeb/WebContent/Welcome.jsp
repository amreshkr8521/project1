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
	background-color: rgb(78, 69, 69);
}
#sideBar {
	height: 500px;
	width: auto;
	background-color: rgb(78, 69, 69);
  margin-top: -20px;

}
#header{
	background-color:rgb(78, 69, 69);
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

<script type="text/javascript" src="welcome.js"></script>
<body>

	<%
		response.setHeader("Pragma", "no-cache");
		if (session.getAttribute("user") == null)
			response.sendRedirect("LoginPage.jsp");
	%>
	<div class="row" id="header">
		<div class="col-md-12">
	<nav class="navbar navbar-light bg-light" >
		<div class="row">
		<div style="color: aliceblue" class="col-sm-2 col-lg-2 col-md-2 col-xs-3">Logo</div>
		<div  class="col-sm-9 col-lg-9 col-md-9 col-xs-6">
			<h3 style="color: aliceblue"> loged in</h3>
		</div>
		<form action="logout" method="post">
			<div class="col-lg-1 col-sm-1 col-xm-3 col-md-1 ">
				<div>
					<button type="submit" class="btn btn-primary btn-block ">Logout</button>
				</div>
			</div>
		</form>

</div>
	</nav>
</div>
		</div>
	<div class="row">
<div class="sidebar col-xs-12 col-sm-3 col-md-3 col-lg-3 shadow-lg p-3 mb-3" data-color="white" data-active-color="danger" id="sideBar">
	<div class="logo">
		<a href="" class="simple-text logo-mini">
			<div class="logo-image-small">
				<img src="">
			</div>
		</a>
		<a href="#" class="simple-text logo-normal">
		User
		</a>
	</div>
	<div class="sidebar-wrapper">
		<ul class="nav">
			<li class="active ">
				<a href="">
					<i class="nc-icon nc-bank"></i>
					<p>Dashboard</p>
				</a>
			</li>
			<li>
				<a href="#">
					<i class="nc-icon nc-bell-55"></i>
					<p>Notifications</p>
				</a>
			</li>
			<li>
				<a href="#">
					<i class="nc-icon nc-single-02"></i>
					<p>User Profile</p>
				</a>
			</li>
			<li>

					<i class="nc-icon nc-tile-56"></i>

					<nav class="navbar navbar-expand-lg navbar-light bg-light ">
						<div class="collapse navbar-collapse " id="navbarSupportedContent">
							<ul class="navbar-nav mr-auto ">
								<li class="nav-item dropdown">
									<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									Gender
									</a>
									<div class="dropdown-menu" aria-labelledby="navbarDropdown" >
										<a class="dropdown-item" href="#">
											<label for="Male" id="male">Male</label></a><br>
											<a class="dropdown-item" href="#">
												<label for="Email" id="female">Female</label></a>
									</div>
								</li>
							</ul>
						</div>
					</nav>
					<nav class="navbar navbar-expand-lg navbar-light bg-light ">
						<div class="collapse navbar-collapse " id="navbarSupportedContent" style="  margin-top: -20px;">
							<ul class="navbar-nav mr-auto ">
								<li class="nav-item dropdown">
									<a  class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									 History
									</a>
									<div class="dropdown-menu" aria-labelledby="navbarDropdown" >
										<a class="dropdown-item" href="#">
											<label for="Male" id="Registration">history</label></a><br>
									</div>
								</li>
							</ul>
						</div>
					</nav>
					<nav class="navbar navbar-expand-lg navbar-light bg-light ">
						<div class="collapse navbar-collapse " id="navbarSupportedContent">
							<ul class="navbar-nav mr-auto ">
								<li class="nav-item dropdown">
									<a  class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								Graph
									</a>
									<div class="dropdown-menu" aria-labelledby="navbarDropdown" >
										<a class="dropdown-item" href="#">
											<label for="" id="age" onclick="Myfun('temp.txt',myFunction)">Age</label></a><br>
											<a class="dropdown-item" href="#">
												<label for="" id="location">Location</label></a>
									</div>
								</li>
							</ul>
						</div>
					</nav>
			</li>
		</ul>
	</div>
</div>
<div class="row">
	<div class="col-md-4">
		<div class="card ">
			<div class="card-header ">
				<h5 class="card-title">Graph</h5>
				<p class="card-category"></p>
			</div>
			<div class="card-body ">

				<div id="chartContainer" style="height: 300px; width: 100%;"></div>
				<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
			</div>
			<div class="card-footer ">
				<hr>

			</div>
		</div>
	</div>
	<div class="card col-md-3">
			<table><th>
  <div class="card-header">
    List
  </div></th>
<tr><td>
  <div class="card-body" id="ShowData"></td></tr>
</table>
  </div>
</div>
</div>
</body>
</html>

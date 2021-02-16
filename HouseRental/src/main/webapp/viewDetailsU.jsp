
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>

	<title>House Rental Management system</title>
	<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Oxygen:400,300,00">
	<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Lora">
  <title>User Input Form</title>
</head>
<body>
	<header>
		<nav id="header-nav" class="navbar navbar-default">
		  <div class="container">
			<div class="navbar-header">
			 

			  <div class="navbar-brand">
				 <a href="HomepageOwner.html"><h1>House Rental Management system</h1></a>
				   </div> 

			
		</div>
	
		<div id="collapsable-nav" class="collapse navbar-collapse">
			<ul id="nav-list" class="nav navbar-nav navbar-right">
				<li>
					<a href="HomepageUser.jsp"><span class="glyphicon glyphicon-home"></span>Home</a>
				</li>
				<li>
					<a href="SearchU.jsp"><span class="glyphicon glyphicon-search"></span>Search House</a>
				</li>
				
				<li>
					<a href="UpdateU.jsp">
						<span class="glyphicon glyphicon-list-alt"></span> Update Details
					</a>
				</li>
				
				

			</ul><!-- #nav-list-->
		</div> <!-- .collapse .navbar-collapse-->
	</div>  <!-- .container-->
	 </nav> <!-- #header-nav-->
	</header>

<div id="main-content" class="container">

	<h2 >View User Details</h2>
	
<form method="post" action="/HouseRental/UserHouse3">
   <legend style="color: #f6b319">Enter Details</legend>
    USER ID:<input style="color:black" type="text" name="name"/><br/><br/>   

<button type="submit" value="View" class="btn btn-yellow px-5">submit</button>   
</fieldset>
</form> 
</div>

<footer class="panel-footer">
	<div class="container">
		
		<div class="text-center">&copy; All Copyright Reserved With House Rental Management System</div>
	</div>
</footer>

	<!--jquery (Bootstrap JS plugins depends on it) -->
	<script src="js/jquery-3.5.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	

</body>
</html>

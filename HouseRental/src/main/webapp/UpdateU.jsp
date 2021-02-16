

<!DOCTYPE html>
<html lang="en">
<head>
	
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>House Rental Management system</title>
	<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Oxygen:400,300,00">
	<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Lora">
	
</head>
<body>
	<header>
		<nav id="header-nav" class="navbar navbar-default">
		  <div class="container">
			<div class="navbar-header">
			 

			  <div class="navbar-brand">
				 <a href="HomepageUser.jsp"><h1>House Rental Management system</h1></a>
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
					<a href="viewDetailsU.jsp">
						<span class="glyphicon glyphicon-list-alt"></span> View Detail
					</a>
				</li>
				
				

			</ul><!-- #nav-list-->
		</div> <!-- .collapse .navbar-collapse-->
	</div>  <!-- .container-->
	 </nav> <!-- #header-nav-->
	</header>

<div id="main-content" class="container">

	<h2 >Update User Details</h2>
	
<form action="/HouseRental/UserHouse2" method="post"> 
 <legend style="color: #f6b319">Enter Details</legend> 
User ID :<input style="color:black" type="text" name="userid"/><br/><br/>  

Phone number :<input style="color:black" type="text" name="phone"/><br/><br/>  
E-mail ID :<input style="color:black" type="text" name="email"/><br/><br/>  
State :<input style="color:black" type="text" name="state"/><br/><br/>  
City :<input style="color:black" type="text" name="city"/><br/><br/>  
<button type="submit" value="submit" class="btn btn-yellow px-5">submit</button>   
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
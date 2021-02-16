<!--DOCTYPE html>
<html>
<head>
  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
  <title>User Input Form</title>
</head>
 
<body>
<h2> SEARCH HOUSES </h2>
<form method="post" action="/HouseRental/UserHouse1">
    <legend>Enter Details</legend>
    Filter: <input type="radio" name="f" value="location" checked />Location
    <input type="radio" name="f" value="type" />Type
    <input type="radio" name="f" value="sp" />Selling Price
    <input type="radio" name="f" value="rp" />Rental Price<br/><br />  
    Value:<input type="text" name="value"/><br/><br/> 
    <input type="submit" value="SEARCH"/>
</fieldset>
</form>
</body>
</html-->

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
				 <a href="HomepageOwner.jsp"><h1>House Rental Management system</h1></a>
				   </div> 

			
		</div>
	
		<div id="collapsable-nav" class="collapse navbar-collapse">
			<ul id="nav-list" class="nav navbar-nav navbar-right">
				<li>
					<a href="HomepageUser.jsp"><span class="glyphicon glyphicon-home"></span>Home</a>
				</li>
				<li>
					<a href="updateU.jsp">
						<span class="glyphicon glyphicon-refresh"></span> Update Detail
					</a>
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

	<h2 >Search House </h2>
<form method="post" action="/HouseRental/UserHouse1">
    <legend style="color: #f6b319">Enter Details</legend>
    Filter: <input type="radio" name="f" value="location" checked />Location
    <input type="radio" name="f" value="type" />Type
    <input type="radio" name="f" value="area"/>AREA (in sqft.)
    <input type="radio" name="f" value="sp" />Selling Price
    <input type="radio" name="f" value="rp" />Rental Price<br/><br />  
    Value:<input style="color:black" type="text" name="value"/><br/><br/> 
  
    <button type="submit"  value="SEARCH" class="btn btn-yellow px-3 mr-3">Search</button> 
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

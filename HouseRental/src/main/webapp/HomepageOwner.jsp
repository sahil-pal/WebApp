
	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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

<style>
body{
	font-size: 16px;
	color: #fff;
	background-color: #61122f;
	
	font-family: 'Oxygen', sans-serif;
	
}

.navbar-brand{
	padding-top: 15px; 
font-family: 'Lora' , serif;
color: #557c3e;
font-size: 1.5em;
text-transform: uppercase;
font-weight: bold;
text-shadow: 1px 1px 1px #222;
margin-top: 0;
margin-bottom: 0;
line-height: .75;
}
.navbar-brand a:hover, .navbar-brand a:focus {
	text-decoration: none;
}

.navbar-brand span{
	vertical-align: middle;
}

#nav-list{
	margin-top: 10px;
}
#nav-list a{
	color: #951C49;
	text-align: center;
}

#nav-list a:hover {
	background: #E7E7E7;
}
#nav-list a span {
	font-size: 1.8em;
}


.navbar-header button.navbar-toggle, .navbar-header .icon-bar
{
	border: 1.5px solid #61122f;
}
.navbar-header button.navbar-toggle{
	clear: both;

}
/****HEADER****/
#header-nav {
	background-color: #f6b319;

	border-radius: 0;
	border: 0; 
}


/*** header end***/

.btn-yellow {
    border: 2px solid #F9A825;
    background-color: #F9A825;
    color: #fff;
    font-weight: bold;
    letter-spacing: 1px
}

.btn-yellow:hover {
    background-color: #F57F17;
    border: 2px solid #F57F17
}

.btn-inverse {
    border: 2px solid #F9A825;
    background-color: transparent;
    color: #F9A825;
    font-weight: bold;
    letter-spacing: 1px
}

.btn-inverse:hover {
    background-color: #F57F17;
    color: #fff;
    border: 2px solid #F57F17
}




/***homepage****/
#add-tile, #update-tile, #delete-tile, #view-tile {
	height: 250px;
	width: 100%;
	margin-bottom: 15px;
	position: relative;
	border: 2px solid #3F0C1F;
	overflow: hidden;
}
#add-tile:hover, #update-tile:hover, #delete-tile:hover, #view-tile:hover{
	box-shadow: 0 1px 5px 1px #cccccc;
}
#add-tile
{
	background: url("images/add.jpg") no-repeat;
	background-position: center;
	background-size: 550px 250px;
	
}
#update-tile {
	background: url("images/update.jpg")no-repeat;
	background-position: center;
	background-size: 550px 250px;
	
}
#delete-tile {
	background: url("images/delete.jpg")no-repeat;
	background-position: center;
	background-size: 550px 250px;
}
#view-tile {
	background: url("images/view.jpg")no-repeat;
	background-position: center;
	background-size: 550px 250px;
	
}

#add-tile span, #update-tile span, #delete-tile span, #view-tile span {
	position: absolute;
	bottom: 0;
	right: 0;
	width: 100%;
	text-align: center;
	font-size: 1.6em;
	text-transform: uppercase;
	background-color: #000;
	color: #fff;
	opacity: .7;
}
/* END HOME PAGE */


.panel-footer {
	margin-top: 30px;
	padding-top: 35px;
	padding-bottom: 30px;
	background-color: #222;
	border-top: 0;
}
* {box-sizing: border-box}
body {font-family: Verdana, sans-serif; margin:0}
.mySlides {display: none}
img {vertical-align: middle;}



#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}



#customers tr:hover {background-color:#f6b319;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}



</style>
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
					<a href="addO.jsp"><span class="glyphicon glyphicon-plus"></span>Add House</a>
				</li>
				<li>
					<a href="updateO.jsp"><span class="glyphicon glyphicon-refresh"></span> Update House</a>
				</li>
				<li>
					<a href="viewO.jsp"><span class="glyphicon glyphicon-refresh"></span> View House</a>
				</li>
				<li>
					<a href="deleteO.jsp">
						<span class="glyphicon glyphicon-trash"></span> Delete House
					</a>
				</li>
				<li>
					<a href="logout.jsp">
						<span class="glyphicon glyphicon-trash"></span> LogOut
					</a>
				</li>
				
				

			</ul><!-- #nav-list-->
		</div> <!-- .collapse .navbar-collapse-->
	</div>  <!-- .container-->
	 </nav> <!-- #header-nav-->
	</header>

<div id="main-content" class="container">
	
   <div id="home-tiles" class="row">
   	<div class="col-md-6">
   		<a href="addO.jsp"><div id="add-tile"><span>Add Details</span></div></a>
   	</div>
   	<div class="col-md-6">
   		<a href="updateO.jsp"><div id="update-tile"><span>Update Details</span></div></a>
   	</div>
     <div class="col-md-6">
   		<a href="deleteO.jsp"><div id="delete-tile">
   			<span>Delete Details</span></div></a>
   	</div>
   	<div class="col-md-6">
   		<a href="viewO.jsp"><div id="view-tile"><span>View Houses</span></div></a>
   	</div>
   </div>
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
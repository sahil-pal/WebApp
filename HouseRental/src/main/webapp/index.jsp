<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>

<style>
	body {
		position: relative;
    color: #000;
    overflow-x: hidden;
    height: 100%;
    background: url("backgroundimage.jpg");
    background-size:1700px 800px;
    background-repeat: no-repeat
}
.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  padding: 12px 16px;
  z-index: 1;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.card {
	position: absolute;
	right: 200px;
	top: 200px;
    width: 32%;
    padding: 30px;
    box-shadow: 0px 8px 16px 0px #1976D2;
    max-width: 511px
}

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



button:focus {
    -moz-box-shadow: none !important;
    -webkit-box-shadow: none !important;
    box-shadow: none !important;
    outline-width: 0
}

a:hover {
    color: inherit
}

.text-sm {
    font-size: 14px
}

.text-dim {
    color: #BDBDBD
}

.icon {
    width: 20px;
    height: 20px;
    cursor: pointer
}


</style>
</head>
<body>
<td colspan="2"><%@ include file="/header.jsp" %></td>
	<div class="container-fluid px-4 px-md-4 py-5 mx-auto">
    <div class="row">
        <div class="card">
            <h1 class="mb-0">House Rental Management System</h1>
            <p>Rent with us</p>
            <div class="row mt-auto mb-2">
                <div class="col-6 dropdown"><button type="submit" class="btn btn-block btn-yellow">Login</button><div class="dropdown-content">
  <a href="loginOwner.jsp"><p>Owner Login</p></a>
  <a href="loginUser.jsp"><p>Customer Login</p></a>
  </div> </div>
                <div class="col-6 dropdown"><button type="submit" class="btn btn-block btn-inverse">Register</button><div class="dropdown-content">
  <a href="RegisterOwner.jsp"><p>Owner Register</p></a>
  <a href="RegisterUser.jsp"><p>Customer Register</p></a>
  </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>

<!--body>
<h2> HOUSE RENTAL MANAGEMENT SYSTEM </h2>

<tr><td align="center"><a href = "loginOwner.jsp"><p align = "center" style="text-align:center">LOGIN OWNER</p></a>
	</td></tr>
	
<tr><td align="center"><a href = "loginUser.jsp"><p align = "center" style="text-align:center">LOGIN CUSTOMER</p></a>
	</td></tr>
	
<tr><td align="center"><a href = "Register.jsp"><p align = "center" style="text-align:center">REGISTER</p></a>
	</td></tr>

</body>
</html-->

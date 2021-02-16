<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
    background: url("images/backgroundimage.jpg");
    background-size:1700px 1000px;
    background-repeat: no-repeat
}

.card {
        position: absolute;
    right: 100px;
    
    width: 32%;
    padding: 30px;
    box-shadow: 0px 8px 16px 0px #1976D2;
    max-width: 511px
}

.card0 {
    width: 100%;
    padding-right: 30px;
    box-shadow: none
}

.card1 {
    background: linear-gradient(rgba(255, 255, 255, .2), rgba(255, 255, 255, .2)), url("https://i.imgur.com/AMBgumm.jpg");
    min-height: 600px
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

::placeholder {
    color: #E0E0E0;
    opacity: 1
}

:-ms-input-placeholder {
    color: #E0E0E0
}

::-ms-input-placeholder {
    color: #E0E0E0
}

input {
    padding: 1px 0px 3px 0px;
    border: none;
    border-bottom: 1px solid lightgrey;
    margin-bottom: 3px;
    margin-top: 2px;
    box-sizing: border-box;
    color: #000;
    font-size: 16px;
    letter-spacing: 1px;
    font-weight: 500
}

input:focus {
    -moz-box-shadow: none !important;
    -webkit-box-shadow: none !important;
    box-shadow: none !important;
    border-bottom: 1px solid #EF5350;
    outline-width: 0
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

@media screen and (max-width: 1056px) {
    .card {
        width: 100%
    }

    .align {
        justify-content: center !important
    }
}
</style>
</head>
<body>
    <div class="container-fluid px-4 px-md-4 py-5 mx-auto">
    <div class="row">
        <div class="card border-0 rounded-0 mb-5">
            <h1 class="mb-2">Register as User</h1> <small>Enter your details below</small>
            <div class="row px-3 mt-4 mb-3">
            	<form action="/HouseRental/UserRegister" method="post">
           
            </div> <label class="font-weight-bold mb-0">Firstname</label> <input type="text" name="fname" class="mb-4" placeholder="Shashank"> <label class="font-weight-bold mb-0">Last Name</label> <input type="text" name="lname" class="mb-4" placeholder="Aggarwal"> <label class="font-weight-bold mb-0">User Id</label> <input type="text" name="userid" class="mb-4" placeholder="1234567890"><label class="font-weight-bold mb-0">Phone Number</label> <input type="text" name="contact" class="mb-4" placeholder="1234567890"><label class="font-weight-bold mb-0">Email</label> <input type="text" name="email" class="mb-4" placeholder="abc@xyz.com">  <label class="font-weight-bold mb-0">State</label> <input type="text" name="state" class="mb-4" placeholder="Haryana ">  <label class="font-weight-bold mb-0">City</label> <input type="text" name="city" class="mb-4" placeholder="Gurgaon "> <label class="font-weight-bold mb-0">Password</label> <input type="password" name="password" placeholder="&#9679;&#9679;&#9679;&#9679;&#9679;&#9679;&#9679;&#9679;"><label class="font-weight-bold mb-0">Confirm Password</label> <input type="password" name="cpassword" placeholder="&#9679;&#9679;&#9679;&#9679;&#9679;&#9679;&#9679;&#9679;" >
           
            <div class="row px-3 mt-5"> <button type="submit"  value="SUBMIT DETAILS" class="btn btn-yellow px-3 mr-3">Register</button> 
        </div>
    </div>
</div>
<div>


	<a href="index.jsp"><span class="glyphicon glyphicon-home"></span>GO BACK</a>

</div> 
</body>
</html>
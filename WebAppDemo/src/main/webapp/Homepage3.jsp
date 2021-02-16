<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
	<!-- adding css -->
	
	<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<style>
    body {
    background-attachmentP:fix;
    background: url("images/img1.jpeg");
    background-size:auto;
    background-repeat: no-repeat
	}
</style>
</head>
<body style="background : url (img1.jpeg);"> 
	
	<div class = "container">
		<div class="row">
			<div class="col m8 offset-m3">
				<div class="">
					<h3>ADD DETAILS HERE</h3>
						<div class="form">
						<form id="detailForm" action="Servlet1" method="post">
							<table>
								<tr>
									<td>Enter your First Name</td>
									<td><input type= "text" name="user_fname" placeholder="Enter here"></td>
								</tr>
								<tr>
									<td>Enter your Last Name</td>
									<td><input type = "text" name="user_lname" placeholder="Enter here"></td>
								<tr>
								<tr>
									<td>Select gender</td>
									<td><input type="radio" name="user_gender" value="male">Male</td>
									<td style="text-align:left; color:black;"><input type="radio" name="user_gender" value="female">Female</td>
								</tr>
								<tr>
									<td>Select Course</td>
									<td>
									<select name = "user_course">
									<option value="">Select from here</option>
									<option value="Btech">Btech</option>
									<option value="BBA">BBA</option>
									<option value="Bsc">Bsc</option>
									<option value="BA">BA</option>
									</select>
									</td>
								</tr>
								<tr>
									<td style="text-align:center;"><input type ="checkbox" name="terms" value="checked"></td>
									<td>I accept terms & conditions </td>
								<tr>
								<tr></tr>
								<tr>
									<td style="text-align : center;"><button type="submit">SUBMIT</td>
									<td style="text-align : center;"><button type="reset">RESET</td>
								</tr>
						</table>	
					</form>	
					</div>
					<div class="loader">
					
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
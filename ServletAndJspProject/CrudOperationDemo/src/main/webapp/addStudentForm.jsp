<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Student Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container shadow mt-5">
	
	   <h1 class="text-center">Add Student</h1>

		<div class="row">

			<div class="col-md-8 offset-md-2">
			
				<form action="addStudent.jsp" method="post">
				
					<div class="mb-2">
						<label for="name" class="form-label">Enter Name</label> 
						<input type="text" class="form-control" id="name" name="name" required="required" placeholder="Enter Here"/>	
					</div>
					
					<div class="mb-3">
						<label for="city" class="form-label">Enter City</label>
						<input type="text" class="form-control" id="city" name="city" required="required" placeholder="Enter Here"/>
					</div>
					
					<div class="mb-3">
						<label for="salary" class="form-label">Enter Salary</label>
						<input type="text" class="form-control" id="salary" name="salary" required="required" placeholder="Enter Here"/>
					</div>
					
					<div class="container text-center">
					     <button type="submit" class="btn btn-outline-primary m-2">Add Student</button>
					     <button type="reset" class="btn btn-outline-danger">Reset</button>
					</div>
				</form>


			</div>

		</div>
	</div>
</body>
</html>
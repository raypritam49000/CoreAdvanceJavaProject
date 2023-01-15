<%@ page language="java" session="false" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	${param.id}

	<c:set var="id" value="${param.id}" />

	<sql:query dataSource="${dbconnection}" var="result">
       SELECT * from student where id = ? ;
        <sql:param value="${id}" />
	</sql:query>
	
	<c:forEach var="row" items="${result.rows}">
		<c:set var="id" value="${row.id}" />
		<c:set var="name" value="${row.name}" />
		<c:set var="city" value="${row.city}" />
		<c:set var="salary" value="${row.salary}" />
	</c:forEach>
	
	
	<div class="container shadow mt-5">
	
	   <h1 class="text-center">Update Student</h1>

		<div class="row">

			<div class="col-md-8 offset-md-2">
			
				<form action="updateStudent.jsp" method="post">
				
				    <div class="mb-2">
						<label for="id" class="form-label">Enter Id</label> 
						<input type="text" class="form-control" id="id" name="id" required="required" placeholder="Enter Here" value="${id}"/>	
					</div>
				
					<div class="mb-2">
						<label for="name" class="form-label">Enter Name</label> 
						<input type="text" class="form-control" id="name" name="name" required="required" placeholder="Enter Here" value="${name}"/>	
					</div>
					
					<div class="mb-3">
						<label for="city" class="form-label">Enter City</label>
						<input type="text" class="form-control" id="city" name="city" required="required" placeholder="Enter Here" value="${city}"/>
					</div>
					
					<div class="mb-3">
						<label for="salary" class="form-label">Enter Salary</label>
						<input type="text" class="form-control" id="salary" name="salary" required="required" placeholder="Enter Here" value="${salary}"/>
					</div>
					
					<div class="container text-center">
					     <button type="submit" class="btn btn-outline-primary m-2">Update Student</button>
					     <button type="reset" class="btn btn-outline-danger">Reset</button>
					</div>
				</form>


			</div>

		</div>
	</div>
	
	
	
</body>
</html>
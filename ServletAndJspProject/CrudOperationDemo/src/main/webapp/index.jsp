<%@ page language="java" session="false" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Of Students</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<sql:setDataSource var="dbconnection" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/test" user="root" password="1998"
		scope="application"/>

	<c:out value="${dbconnection}"></c:out>

	<sql:query dataSource="${dbconnection}" var="result">
       SELECT * from student;
    </sql:query>

	<div class="container mt-5 text-center shadow">
	    <a href="addStudentForm.jsp" class="btn btn-outline-primary mt-2">Add Student</a>
	    <h2>List of Students</h2>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#Id</th>
					<th scope="col">Name</th>
					<th scope="col">City</th>
					<th scope="col">Salary</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="row" items="${result.rows}">
					<tr>
						<td><c:out value="${row.id}" /></td>
						<td><c:out value="${row.name}" /></td>
						<td><c:out value="${row.city}" /></td>
						<td><c:out value="${row.salary}" /></td>
                        <td>
                         <a href="updateStudentForm.jsp?id=${row.id}" class="btn btn-outline-primary m-2">Edit</a>
                         <a href="deleteStudent.jsp?id=${row.id}" class="btn btn-outline-danger">Delete</a>
                        </td>
					</tr>
				</c:forEach>
			<tbody>
		</table>
	</div>

</body>
</html>
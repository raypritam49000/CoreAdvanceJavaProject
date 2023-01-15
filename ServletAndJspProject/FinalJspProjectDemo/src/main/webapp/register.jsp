<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--
	String name = request.getParameter("name");
	String city = request.getParameter("city");
	String salary = request.getParameter("salary");
	out.println(name + " " + city + " " + salary);

	Employee employee = new Employee(name, city, salary);
	Boolean isDataSaved = EmployeeDao.registerUser(employee);

	if (isDataSaved) {
		out.println("Employee are register successfully...");
	} else {
		out.println("Error occure when Employee are register...");
	}
	--%>
	<jsp:useBean id="employee" class="com.model.Employee"></jsp:useBean>
	<jsp:setProperty name="employee" property="*" />

	<%
	out.println(employee);

	Boolean isDataSaved = EmployeeDao.registerUser(employee);

	if (isDataSaved) {
		out.println("Employee are register successfully...");
	} else {
		out.println("Error occure when Employee are register...");
	}
	%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${param.id} || ${param.name} || ${param.city} || ${param.salary}

	<c:set var="id" value="${param.id}" />
	<c:set var="name" value="${param.name}" />
	<c:set var="city" value="${param.city}" />
	<c:set var="salary" value="${param.salary}" />

	<sql:update dataSource="${dbconnection}" var="result">
       UPDATE student SET name = ? , city = ? , salary = ? where id = ?;
        <sql:param value="${name}" />
		<sql:param value="${city}" />
		<sql:param value="${salary}" />
		<sql:param value="${id}" />
	</sql:update>

	<c:out value="${result}"></c:out>

	<c:choose>
		<c:when test="${result > 0}">
			<jsp:forward page="index.jsp" />
		</c:when>

		<c:otherwise>
			<jsp:forward page="addStudentForm.jsp" />
		</c:otherwise>
	</c:choose>

</body>
</html>
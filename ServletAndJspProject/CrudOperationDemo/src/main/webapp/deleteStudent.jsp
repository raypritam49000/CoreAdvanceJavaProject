<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
</head>
<body>
	${param.id}

	<c:set var="id" value="${param.id}" />

	<sql:update dataSource="${dbconnection}" var="result">
      DELETE FROM student WHERE id = ?
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
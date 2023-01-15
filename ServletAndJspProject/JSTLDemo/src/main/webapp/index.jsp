<%@ page language="java" session="false" isELIgnored="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL Demo</title>
</head>

<body>

	<c:out value="${2+3}"></c:out>

	<c:if test="${3>2}">
		<c:out value="${3} is greater the ${2}"></c:out>
	</c:if>

	<c:choose>

		<c:when test="${3<2}">
			<c:out value="${3} is greater the ${2}"></c:out>
		</c:when>

		<c:otherwise>
			<c:out value="${2} is not greater the ${3}"></c:out>
		</c:otherwise>

	</c:choose>
	
	<c:set var="sum" value="${12+3}"></c:set>
	<c:out value="${sum}"></c:out>
	
	

</body>

</html>
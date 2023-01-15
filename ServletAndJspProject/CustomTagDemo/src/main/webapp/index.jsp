<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/maths.tld" prefix="maths"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Custom Tage</title>
</head>
<body>

   <%
      String number1 = request.getParameter("number1");
      String number2 = request.getParameter("number2");
   %>
   
   <maths:sum number2="<%=number2%>" number1="<%=number1%>">
    This is Body 
   </maths:sum>
   
   Rest of Code....

</body>
</html>
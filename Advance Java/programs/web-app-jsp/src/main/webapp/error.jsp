<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isErrorPage="true" %>
<!--This Page Shows Exception  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>404 Error</h1>
	Reason For Exception <%= exception.getMessage() %>
</body>
</html>
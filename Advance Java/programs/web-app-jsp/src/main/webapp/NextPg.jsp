<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%@page errorPage="error.jsp" %> --%>
<%!
	 public int add()
	{
		return 22;
	}
%>
<%
String name = request.getParameter("username");
out.print("<h2>HIIIII "+name+"<h2>"+"<br> I AM "+10/0+" years old");
%>

<%
	response.sendRedirect("https://google.com");
%>
</body>
</html>
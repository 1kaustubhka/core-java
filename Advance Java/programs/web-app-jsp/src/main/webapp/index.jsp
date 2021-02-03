<html>
<body>
<h2>Hello World!</h2>
<form action="NextPg.jsp">
Username:<input type="text" name="username">
<input type="Submit" value="Submit">
</form>
<%-- <%@page errorPage="error.jsp" %> --%>
<%
//you can add any java code in this
String nm = "Kaustubh";
System.out.println("HIIII "+nm);
System.out.println("HIIII "+config.getInitParameter("name"));
System.out.println(10/0);
%>
</body>
</html>

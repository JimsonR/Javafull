<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
<h1>Hello, World!</h1>
<%
String name = request.getParameter("name");
if (name != null) {
out.println("<h2>Hello, " + name + "!</h2>");
} else {
out.println("<h2>Hello, Guest!</h2>");
}
%>
</body>
</html>

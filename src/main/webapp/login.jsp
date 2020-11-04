<%--
  Created by IntelliJ IDEA.
  User: cruzanio
  Date: 11/3/20
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
</head>
<body>

<jsp:include page="partials/navbar.jsp" />

<h1>Form Login</h1>

<c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
    <% response.sendRedirect("/profile.jsp"); %>
</c:if>

<form method="POST" action="http://localhost:8080/login.jsp">
    <input type="text" name="username" placeholder="Enter your username">
    <input type="text" name="password" placeholder="Enter your password">
    <button type="submit">Submit</button>
</form>

</body>
</html>

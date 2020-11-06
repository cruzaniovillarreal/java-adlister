<%--
  Created by IntelliJ IDEA.
  User: cruzanio
  Date: 11/4/20
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Ad List Here" />
    </jsp:include>
</head>
<body>

<c:forEach var="ad" items="${ads}">
    <p>${ad.title.toUpperCase()}</p>
    <p>${ad.description}</p>
</c:forEach>

</body>
</html>

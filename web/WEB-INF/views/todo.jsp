<%--
  Created by IntelliJ IDEA.
  User: mkoenig
  Date: 15.12.2017
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Willkommensseite</title>
</head>
<body>

<p>Hallo ${name}! Herzlich willkommen</p>

<p>Deine Todos sind:</p>

<ol>
    <c:forEach var="todo" items="todos">
        <li>
                ${todo.name}
        </li>
    </c:forEach>
</ol>

</body>
</html>

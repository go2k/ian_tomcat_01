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
    <link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .footer {
            position: absolute;
            bottom: 0px;
            width: 100%;
            height: 60px;
            background-color: #f5f5f5;
        }
    </style>
    <title>Willkommensseite</title>
</head>
<body>
<nav class="navbar navbar-default">
    <a href="http://localhost:8080/todo.do">GBS</a>
    <ul class="nav navbar-nav">
        <li class="active">Home</li>
        <li><a href="http://localhost:8080/todo.do">ToDos</a></li>
    </ul>
</nav>
<div class="container">

    <p>Hallo ${name}! Herzlich willkommen</p>

    <p>Deine Todos sind:</p>

    <ol>
        <c:forEach var="todo" items="${todos}">
            <li>
                    ${todo.name} &nbsp; &nbsp; &nbsp; <a href="/delete-todo.do?name=${todo.name}">delete</a>
            </li>
        </c:forEach>
    </ol>

    <form method="get" action="/addtodo.do">
        <input type="submit" name="addTodo" value="Neues Todo hinzufügen">
    </form>
</div>
<footer class="footer">
    <p>Impressum</p>
</footer>

<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>

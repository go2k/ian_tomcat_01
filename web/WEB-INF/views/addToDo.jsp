<%--
  Created by IntelliJ IDEA.
  User: mkoenig
  Date: 19.01.2018
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Todo</title>
</head>
<body>
<p>neues Todo hinzufügen</p>
<form action="addtodo.do" method="post">
    Name: <input type="text" name="name">
    <input type="submit" name="addnewtodo" value="Eintragen" >
</form>
</body>
</html>

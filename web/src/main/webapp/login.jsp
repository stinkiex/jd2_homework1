<%--
  Created by IntelliJ IDEA.
  by.itacademy.User: astel
  Date: 30.03.2020
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h3>Login</h3>
<form action="${pageContext.request.contextPath}/login" method="post">
    <legend>Sign in:</legend>
    <label for="login">login</label>
    <input id="login" type="text" name="login"> <br/>

    <label for="password">password</label>
    <input id="password" type="password" name="password"><br/>
    <input type="submit">
</form>

<p style="color: red">${error}</p>



</body>
</html>

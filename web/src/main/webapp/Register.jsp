<%--
  Created by IntelliJ IDEA.
  by.itacademy.User: astel
  Date: 30.03.2020
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<h3>Register</h3>
<form action="${pageContext.request.contextPath}/register" method="post">
    <label for="login">login</label>
    <input id="login" type="text" name="login"> <br/>

    <label for="password">password</label>
    <input id="password" type="password" name="password"><br/>
    <label for="password">Confirm password</label>
    <input id="repassword" type="password" name="repassword"><br/>
    <input type="submit">
</form>

<p style="color: red">${error}</p>

</body>
</html>

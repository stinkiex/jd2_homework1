<html>
<body>
<title>Home page</title>
<h2>Welcome</h2>

Please <a href="login.jsp">Login</a> or <a href="register.jsp">Register</a></body></br>

<b>Curent time is </b> <%= new java.util.Date() %>


Расчёт зарплаты:
<form action="${pageContext.request.contextPath}/vatsCalculate" method="post">
    <label for="moneyIn">BYN</label>
    <input id="moneyIn" type="text" name="moneyIn"><br/>
    <input type="submit">
</form>
</body>
</html>

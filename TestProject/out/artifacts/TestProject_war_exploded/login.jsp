
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Welcome, please login:</h1>

<form action="/login" method="post" >
    log in name: <input type="text" name="loginName"/>
    password: <input type="password" name="password" />
    <input type="submit" value="Login"/>
</form>

</body>
</html>

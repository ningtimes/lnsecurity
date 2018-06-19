<%--
  Created by IntelliJ IDEA.
  User: yr_ln
  Date: 2018/6/19
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/securityLogin" method="post">
  用户名：<input type="text" name="username"/><br/>
  密码：<input type="password" name="password"/><br/>
    <input type="submit" value="登陆"/>
</form>
</body>
</html>

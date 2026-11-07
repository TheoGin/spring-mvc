<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>登录成功</title>
    </head>
    <body>
        <%-- <h1>恭喜${requestScope.username}登录成功!</h1> --%>
        <h1>恭喜${requestScope.user.username}登录成功!</h1>
    </body>
</html>
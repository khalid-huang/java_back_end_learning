<%--
  Created by IntelliJ IDEA.
  User: kinthon
  Date: 17-6-23
  Time: 下午8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="user_login" method="post">
    <s:textfield name="user.username" key="用户名" placeholder="输入用户名" />
    <br/>
    <s:password name="user.password" key="密码"  placeholder="输入密码" />
    <br />
    <s:submit value="登录" />
    <s:reset value="重置" />
</s:form>
</body>
</html>


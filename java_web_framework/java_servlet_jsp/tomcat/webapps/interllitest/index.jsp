<%--
  Created by IntelliJ IDEA.
  User: kinthon
  Date: 17-3-22
  Time: 下午4:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>我是title</title>
  </head>
  <body>
    <h1>大家好</h1>
    <!-- 我是HTML注释，在客户端可见 -->
    <%-- 我是JSP 注释，客户端不可见--%>
    <%!
      //这里是JSP定义的变量和方法
      String s = "张三";
      int add(int x, int y)
      {
        return x + y;
      }

    %>
    <%
      //这里是JSP脚本区
      out.println("大家好，开始学习");
    %>
    x+y=<%=add(10,5) %>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: ckg
  Date: 20-5-19
  Time: 下午4:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<%String token = System.currentTimeMillis() + "";--%>
    <%--request.getSession().setAttribute(token, "");--%>
<%--%>--%>
<body>


    　　<h1>测试表单重复提交</h1>
    　　<form action="yyy" method="get">
    　　　　用户名：<input name="username" type="text"/>
    　　　　密码：<input name="password" type="password">
    <%--　　　　<input name="token" value="<%=token%>">--%>
    　　　　<input type="submit">
    　　</form>
    　　<hr>

</body>
</html>

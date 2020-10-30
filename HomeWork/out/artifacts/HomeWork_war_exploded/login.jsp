<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    if (name.equals("xxx")
            && pass.equals("xxx")) {
        out.print("登录成功！");
    } else {
        out.print("登录失败！");
    }
%>
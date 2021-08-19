<%@ page import="com.tlyon.Servlet监听器统计在线人数.UserInfoList" %>
<%@ page import="com.tlyon.Servlet监听器统计在线人数.UserInfoTrace" %>
<%@ page import="java.util.ArrayList" %>

<%--
  Created by IntelliJ IDEA.
  User: Lyon
  Date: 2021-8-19
  Time: 下午 03:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java"
         import="java.sql.*" errorPage=""%>
<html>
<head>
    <title>使用监听器查看在线用户</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<%
    UserInfoList list = UserInfoList.getInstance();
    UserInfoTrace ut = new UserInfoTrace();
    String name = request.getParameter("user");
    ut.setUser(name);
    session.setAttribute("list", list);
    list.addUserInfo(ut.getUser());
    session.setMaxInactiveInterval(10);
%>
</body>
<div align="centent">
    <table width="506" height="246" border="0" cellpadding="0"
           cellspacing="0" background="image/background2.jpg">
        <tr>
            <td align="center">
                <br/>
                <textarea rows="8" cols="20">
                    <%
                        ArrayList<String> vector = list.getList();
                        if (vector != null && vector.size() > 0) {
                            for (int i = 0; i < vector.size(); i++) {
                                out.println(vector.get(i));
                            }
                        }
                    %>
                </textarea>
            </td>
            <br/>
            <br/>
            <a href="loginOut.jsp">返回</a>
        </tr>
    </table>
</div>
</html>

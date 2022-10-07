<%--
  Created by IntelliJ IDEA.
  User: Hard_cheng
  Date: 2022/10/8
  Time: 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算1～100和</title>
</head>
<body>
<%
    int he=0;
    for (int i = 1; i <= 100 ; i++) {
        he+=i;
    }
    out.print("1～100和为"+he);
%>
</body>
</html>

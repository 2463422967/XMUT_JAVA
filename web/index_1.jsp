<%--
  Created by IntelliJ IDEA.
  User: Hard_cheng
  Date: 2022/10/8
  Time: 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法口诀表</title>
</head>
<body>
<%
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <=i ; j++) {
            out.print(j+"*"+i+"="+i*j+" ");
        }
        out.print("<br/>");
    }
%>
</body>
</html>

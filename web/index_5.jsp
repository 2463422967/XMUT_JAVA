<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
	<head>
		<Title>forward动作元素的应用</title>
	</head>
	<body>
		<% String username=request.getParameter("user");%>
		<% String pwd=request.getParameter("pass");%>
		<%
			if (username.equals("admin") && pwd.equals("admin")){
		%>
		<jsp:forward page="success.html"></jsp:forward>
		<%
			}else{
		%>
		<jsp:forward page="login.jsp"></jsp:forward>
	<%
		}
	%>
	</body>
</html>
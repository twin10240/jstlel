<%@page import="vo.UserVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	UserVo vo1 = new UserVo();
	vo1.setNo(10L);
	vo1.setEmail("1twin10240@naver.com");
	
	pageContext.setAttribute("userVo1", vo1);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>객체 접근</h3>
	
	<h3>====== Scope Test1 ======</h3>
	<h2>page scope : ${pageScope.userVo1.no }</h2>
	<h2>request scope : ${requestScope.userVo2.no }</h2>
	<h2>session scope : ${sessionScope.userVo3.no }</h2>
	<h2>application scope : ${applicationScope.userVo4.no }</h2>
	
	<h3>====== Scope Test2 ======</h3>
	<h2>page scope : ${userVo1.no }</h2>
	<h2>request scope : ${userVo2.no }</h2>
	<h2>session scope : ${userVo3.no }</h2>
	<h2>application scope : ${userVo4.no }</h2>	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>연산</h3>
	<h3>${iValue + 10 * 100 / 2 }</h3>
	<h3>${fValue + 10 * 100 / 2 }</h3>
	<h3>${iValue < 100 }</h3>
	<h3>${iValue == 1000 || fValue < 200 }</h3>
	<h3>${empty userVo }</h3>
	<h3>${not empty userVo }</h3>
</body>
</html>
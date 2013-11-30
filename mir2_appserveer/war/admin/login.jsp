<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title>admin</title>
		<link href="/css/defaultStyle.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<table align="center">
    <form action="/admin/login.do" method="post">
    	<tr height="300">
    		<td colspan="2"></td>
    	</tr>
    	<tr>
    		<td>username:</td>
    		<td><input type="text" name="username" value="admin"></td>
    	</tr>
    	<tr>
    		<td>password:</td>
    		<td><input type="password" name="password" value="112233"></td>
    	</tr>
    	<tr>
    		<td colspan="2" align="center"><input type="submit" value="登录"></td>
    	</tr>
    </form>
    </table>
</body>
</html>
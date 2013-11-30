<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title>admin</title>
		<link href="/css/defaultStyle.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<table>
    <form action="/admin/user/create.do" method="post">
    	<tr>
    		<td colspan="2"></td>
    	</tr>
    	<tr>
    		<td>username:</td>
    		<td><input type="text" name="username" value=""></td>
    	</tr>
    	<tr>
    		<td>password:</td>
    		<td><input type="password" name="password" value=""></td>
    	</tr>
    	<tr>
    		<td colspan="2" align="right"><input type="submit" value="新建"></td>
    	</tr>
    </form>
</table>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title><s:text name="index.title" /></title>
		<link href="<s:url value="/css/defaultStyle.css" includeParams="none" />" rel="stylesheet" type="text/css" />
	</head>
<body>
<table align="center">
    <form action="<s:url action="login" namespace="/admin" includeParams="none" />" method="post">
    	<tr height="300">
    		<td colspan="2"><s:actionerror/></td>
    	</tr>
    	<tr>
    		<td><s:text name="user.username" />:</td>
    		<td><input type="text" name="username" value="admin"></td>
    	</tr>
    	<tr>
    		<td><s:text name="user.password" />:</td>
    		<td><input type="password" name="password" value="112233"></td>
    	</tr>
    	<tr>
    		<td colspan="2" align="center"><input type="submit" value="<s:text name="user.login" />"></td>
    	</tr>
    </form>
    </table>
</body>
</html>
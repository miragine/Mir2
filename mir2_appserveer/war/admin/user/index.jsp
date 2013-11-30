<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title>mir2</title>
		<link href="/css/defaultStyle.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<table border="1">
	<tr>
		<td colspan="3"><a href="/admin/user/create.jsp">创建用户</a></td>
	</tr>
	<c:forEach items="${users}" var="user" varStatus="status">
		<tr>
			<td align="left">${user.username}</td>
			<td align="left">${user.password}</td>
			<td><a href="/admin/player/index.do?userId=${user.id}">角色</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
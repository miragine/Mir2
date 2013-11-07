<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title><s:text name="index.title" /></title>
		<link href="<s:url value="/css/defaultStyle.css" includeParams="none" />" rel="stylesheet" type="text/css" />
	</head>
<body>
username: ${username}
${user.id}
${user.username}
${user.createDate}
</body>
</html>
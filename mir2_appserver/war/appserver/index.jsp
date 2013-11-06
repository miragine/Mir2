<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title>WELCOME</title>
		<link href="<s:url value="/css/defaultStyle.css" includeParams="none" />" rel="stylesheet" type="text/css" />
	</head>
<body>
${user.id}
${user.username}
${user.createDate}
</body>
</html>
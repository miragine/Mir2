<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title><s:text name="index.title" /></title>
		<link href="<s:url value="/css/defaultStyle.css" includeParams="none" />" rel="stylesheet" type="text/css" />
	</head>
<body>
 <s:actionerror/>
 <s:form action="home" method="post">
 <s:textfield name="username" label="UserName"></s:textfield>
 <s:textfield name="password" label="Password"></s:textfield>
 <s:submit name="login" value="login"></s:submit>
</body>
</html>
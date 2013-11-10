<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title>mir2</title>
		<link href="/css/defaultStyle.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<div class="inscribe">
<table align="left">
	<tr>
		<td><a href="/admin/profession/init.do">初始化</a></td>
	</tr>
	<c:forEach items="${warriors}" var="warrior" varStatus="status">
		<tr>
			<td>等级</td>
			<td>HP</td>
		</tr>
		<tr>
			<td align="left">${warrior.level}</td>
			<td align="left">${warrior.hp.value}</td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>
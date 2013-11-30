<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title><decorator:title /> - fire.gamerfire.com</title>
		<link href="/css/defaultStyle.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<table>
	<tr>
		<td valign="top">
		<table border="1" align="left">
			<tr>
				<td><a href="/admin/user/index.do">用户</a></td>
			</tr>
			<tr>
				<td><a href="/admin/profession/index.do">职业</a></td>
			</tr>
		</table>
		</td>
		<td valign="top">
			<decorator:body />
		</td>
	</tr>
</table>
</body>
</html>
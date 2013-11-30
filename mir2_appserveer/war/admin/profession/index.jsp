<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title>mir2</title>
		<link href="/css/defaultStyle.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<div class="inscribe">
<table>
	<tr>
		<td>
			<table border="1">
				<tr>
					<td colspan="2" align="left"><a href="/admin/profession/init.do?type=Warrior">初始化战士</a></td>
				</tr>
				<c:forEach items="${warriors}" var="warrior" varStatus="status">
					<tr>
						<td align="left">${warrior.level} 等级</td>
						<td align="left">${warrior.hpValue} hp</td>
					</tr>
				</c:forEach>
			</table>
		</td>
		<td>
			<table border="1">
				<tr>
					<td colspan="2" align="left"><a href="/admin/profession/init.do?type=Taoist">初始化道士</a></td>
				</tr>
				<c:forEach items="${taoists}" var="taoist" varStatus="status">
					<tr>
						<td align="left">${taoist.level} 等级</td>
						<td align="left">${taoist.hpValue} hp</td>
					</tr>
				</c:forEach>
			</table>
		</td>
		<td>
			<table border="1">
				<tr>
					<td colspan="2" align="left"><a href="/admin/profession/init.do?type=Magician">初始化法师</a></td>
				</tr>
				<c:forEach items="${magicians}" var="magician" varStatus="status">
					<tr>
						<td align="left">${magician.level}  等级</td>
						<td align="left">${magician.hpValue} hp</td>
					</tr>
				</c:forEach>
			</table>
		</td>
		<td>
			<table border="1">
				<tr>
					<td colspan="2" align="left"><a href="/admin/profession/init.do?type=Assassin">初始化刺客</a></td>
				</tr>
				<c:forEach items="${assassins}" var="assassin" varStatus="status">
					<tr>
						<td align="left">${assassin.level}  等级</td>
						<td align="left">${assassin.hpValue} hp</td>
					</tr>
				</c:forEach>
			</table>
		</td>
	</tr>
</table>
</div>
</body>
</html>
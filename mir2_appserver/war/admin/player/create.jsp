<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="/commons/taglibs.jsp"%>

<html>
	<head>
		<title>admin</title>
		<link href="/css/defaultStyle.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<table>
    <form action="/admin/player/create.do" method="post">
    	<tr>
    		<td colspan="2"></td>
    	</tr>
    	<tr>
    		<td>name:</td>
    		<td><input type="text" name="name" value=""></td>
    	</tr>
    	<tr>
    		<td>level:</td>
    		<td><input type="text" name="level" value=""></td>
    	</tr>
    	<tr>
    		<td>性别:</td>
    		<td>
    			<select name="sex">
    				<option value="MALE">男</option>
    				<option value="FEMALE">女</option>
    			</select>
    		</td>
    	</tr>
    	<tr>
    		<td>职业:</td>
    		<td>
    			<select name="type">
					<option value="ASSASSIN">刺客</option>
    				<option value="MAGICIAN">魔法师</option>
    				<option value="TAOIST">道士</option>
    				<option value="WARRIOR">战士</option>
	   			</select>
    		</td>
    	</tr>
    	<tr>
    		<td colspan="2" align="right"><input type="submit" value="新建"></td>
    	</tr>
    </form>
</table>
</body>
</html>
<%@ taglib prefix="t" uri="/struts-tags"%>
<html>
<head>
</head>

<body>
	<h1>Struts 2 + Spring integration example</h1>

	<table id="firstTable" border="1">
		<t:iterator value="users" status="user">
			<tr>
				<td><t:property value="%{userName}" /></td>
				<td><t:property value="%{password}" /></td>
			</tr>
		</t:iterator>
	</table>

</body>
</html>
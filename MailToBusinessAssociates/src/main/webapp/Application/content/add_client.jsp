<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MBAS - Create User Page</title>
<sx:head />
</head>
<body>
	<h2>Create User</h2>
	<s:form action="RegisterUser">
		<s:textfield name="firstName" key="label.firstName" size="20" />
		<s:textfield name="lastName" key="label.lastName" size="20" />
		<s:textfield name="username" key="label.username" size="20" />
		<s:password name="password" key="label.password" size="20" />
		<s:textfield name="email" key="label.email" size="20" />
		<s:checkboxlist list="{'Activate'}" name="isActive" />
		<s:checkboxlist list="{'View', 'Insert', 'Update', 'Delete'}"
			name="privileges" />
		<s:submit action="" key="label.copy_privileges" />
		<s:submit key="label.submit" />
		<s:submit key="label.cancel" />
	</s:form>
</body>
</html>
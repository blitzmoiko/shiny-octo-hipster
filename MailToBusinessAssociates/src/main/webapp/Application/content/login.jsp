<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MBAS - Login Application</title>
<sx:head />
</head>
<body>
	<h1>MBAS</h1>
	<h3>City Properties Real Estate LLC.</h3>
	<s:actionerror />
	<s:form action="Application/login">
		<s:textfield name="username" key="label.username" size="20" />
		<s:password name="password" key="label.password" size="20" />
		<s:submit key="label.login" />
	</s:form>
</body>
</html>
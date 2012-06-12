<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MBAS - Change Password</title>
<sx:head />
</head>
<body>
	<s:form action="ChangePassword">
		<s:password name="oldPassword" key="label.oldPassword" size="20" />
		<s:password name="newPassword" key="label.newPassword" size="20" />
		<s:password name="reNewPassword" key="label.reNewPassword" size="20" />
		<s:submit key="label.submit" />
		<s:submit key="label.cancel" />
	</s:form>
</body>
</html>
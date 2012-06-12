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
	<s:form action="changePassword">
		<s:password name="oldPassword" key="label.old_password" size="20" />
		<s:password name="newPassword" key="label.new_password" size="20" />
		<s:password name="reNewPassword" key="label.re_new_password" size="20" />
		<s:submit key="label.submit" />
		<s:submit key="label.close" />
	</s:form>
</body>
</html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MBAS - Add Letter Content</title>
<sx:head />
</head>
<body>
	<s:form action="addLetterContent">
		<s:textfield name="letterContentName" key="label.letter_content_name" size="20" />
		<s:textarea name="letterContentContent" />
		<s:submit key="label.save" />
		<s:submit key="label.close" />
	</s:form>
</body>
</html>
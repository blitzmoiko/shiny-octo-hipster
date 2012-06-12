<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MBAS - Add Letter Template</title>
<sx:head />
</head>
<body>
	<s:form action="addLetterTemplate">
		<s:textfield name="letterTemplateName" key="label.letter_template_name" size="20" />
		<s:submit key="label.find_image" />
		<s:textarea name="letterTemplateContent" />
		<s:submit key="label.save" />
		<s:submit key="label.close" />
	</s:form>
</body>
</html>
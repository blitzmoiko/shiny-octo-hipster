<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MBAS - Create Mail Type</title>
<sx:head />
</head>
<body>
	<h2>Create Mail Type</h2>
	<s:actionerror />
	<s:form action="addMailType">
		<s:textfield name="mailType" key="label.mail_type_name" size="20" />

		<sx:tabbedpanel id="tabContainer">
			<sx:div label="Body">
			BODY
			</sx:div>
			<sx:div label="Preview">
			PREVIEW
			</sx:div>
		</sx:tabbedpanel>

		<s:checkbox id="" key="label.include_form" />
		<s:submit action="" key="label.select_letter_content" />
		<s:textarea />
		<s:submit action="" key="label.select_letter_template" />
		<s:textarea />
		<s:submit action="" key="label.save" />
		<s:submit action="" key="label.close" />
	</s:form>
</body>
</html>
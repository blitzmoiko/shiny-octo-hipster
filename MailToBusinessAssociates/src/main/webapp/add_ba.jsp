<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MBAS - Create Business Associate Page</title>
<sx:head />
</head>
<body>
	<h2>Create Business Associate</h2>
	<s:form action="addBA">
		<s:textfield name="firstName" key="label.first_name" size="20" />
		<s:textfield name="middleName" key="label.middle_name" size="20" />
		<s:textfield name="lastName" key="label.last_name" size="20" />
		<s:textfield name="email" key="label.email" size="20" />
		<s:radio name="gender" list="{'Male','Female'}" key="label.gender" />
		<s:textfield name="homePhone" key="label.home_phone" size="20" />
		<s:textfield name="workPhone" key="label.work_phone" size="20" />
		<s:textfield name="mobilePhone" key="label.mobile_phone" size="20" />
		<sx:datetimepicker name="birthDate" key="label.birth_date"
			displayFormat="dd-MMM-yyyy" value="%{'2000-01-01'}" />
		<sx:datetimepicker name="anniversaryDate" key="label.anniversary_date"
			displayFormat="dd-MMM-yyyy" value="%{'2000-01-01'}" />
		<s:textfield name="regToUser" key="label.reg_to_user" size="20" />
		<s:submit action="" key="label.find_user" />
		<s:checkboxlist list="{'Supplier'}" name="isSupplier" />
		<s:submit key="label.submit" />
		<s:submit key="label.close" />
	</s:form>
</body>
</html>
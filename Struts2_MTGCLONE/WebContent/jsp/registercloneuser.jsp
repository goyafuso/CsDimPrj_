<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>REGISTER PAGE</h1>
	<s:property value="user"/>
	<s:form action="register">
		<s:textfield name="user.fname" placeholder="FIRST NAME" />
		<s:textfield name="user.lname" placeholder="LAST NAME" />
		<s:textfield name="user.pass" placeholder="PASSWORD" />
		<s:textfield name="confirm" placeholder="CONFIRMPASSWORD" />
		<s:textfield name="user.DOB" placeholder="Date Of Birth" />
		<s:textfield name="user.email" placeholder="Email" />
		<s:submit />
	</s:form>
	<div>
		<s:url action="home" var="home">
			<s:param name="mainContent" value="home"/>
		</s:url>
		<p>
			<a href="${home}">Home</a>
		</p>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:url action="login" var="hellolink">
		<s:param name="userName">BRUCE P</s:param>
	</s:url>
	<p>
		<a href="${hellolink}">BRUCE</a>
	</p>
	<s:property value="messageStore.message"/>
	<s:property value="user"/>
	<s:form action="home">
	<s:textfield name="user.fname" placeholder="FIRST NAME"/>
		<s:textfield name="user.lname" placeholder="LAST NAME"/>
		<s:textfield name="user.pass" placeholder="PASSWORD"/>
		<s:textfield name="user.DOB" placeholder="Date Of Birth"/>
		<s:textfield name="user.email" placeholder="Email"/>
		<s:submit/> 
		<%-- <s:textfield name="user.fname" label="FIRST NAME"/>
		<s:textfield name="user.lname" label="LAST NAME"/>
		<s:textfield name="user.pass" label="PASSWORD"/>
		<s:textfield name="user.DOB" label="Date Of Birth"/>
		<s:textfield name="user.email" label="Email"/>
		<s:submit/> --%>
	</s:form>
</body>
</html>
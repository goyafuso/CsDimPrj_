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
<h1>HEADER PAGE</h1>
	<div>
		<s:url action="home" value="home" var="loginUrl">
			<s:param name="mainContent"  value = "%{'login'}" />
		</s:url>
		<a href="${loginUrl}" >Login</a>
	<%-- 	<s:include value="login.jsp" /> --%>
	</div>
	<div>
		<s:url action="home" value ="home" var="reigsterUrl">
			<s:param name="mainContent"  >register</s:param>
		</s:url>
		<a href="${reigsterUrl}" >Register</a>	
	<%-- 	<s:include value="register.jsp" /> --%>
	</div>
</body>
</html>
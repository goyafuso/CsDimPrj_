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
<h1>TEMPLATE</h1>
<s:property value="mainContent" />
<div><h2>Header:<s:include value="header.jsp" /></h2></div>
<div><h2>Body:<jsp:include page="${mainContent}.jsp"/></h2></div>
<div><h2>Footer:<s:include value="footer.jsp" /></h2></div>
</body>
</html>
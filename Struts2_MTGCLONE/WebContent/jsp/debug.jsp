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
<a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a>
<s:url action="index" var="indexLink">
  <s:param name="debug">browser</s:param>
</s:url>
<p><a href="${indexLink}">Reload this page with debugging</a></p>
</body>
</html>
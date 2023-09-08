<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="myjsp" uri="/WEB-INF/mytags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<myjsp:checkNumber number="<%=request.getParameter(\"num\") %>"/>	
	
</body>
</html>
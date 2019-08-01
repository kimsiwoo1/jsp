<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Enumeration<String> headernames = request.getHeaderNames();
		
	%>
	<h2>request header</h2>
	<ul>
		<%while(headernames.hasMoreElements()){
			String headerName = headernames.nextElement();
		%>
			<li><%=headerName %> : <%=request.getHeader(headerName) %></li>
		<%}%>
	</ul>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public int factorial(int fac){
		if(fac<=1){
			return 1;
		}else{
			return factorial(fac-1)*fac;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%for(int i=0; i<=8; i++){ %>
		factorial(<%=i %>) : <%=factorial(i) %> <br>
	<%} %>
</body>
</html>
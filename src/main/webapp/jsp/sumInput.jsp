<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/sumCalculation" method="post">
		숫자1 : <input type="text" name="start"/>
		숫자2 : <input type="text" name="end"/>
		<button type="submit">전송</button>
	</form>
</body>
</html>
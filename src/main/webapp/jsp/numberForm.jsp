<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/jsp/sum.jsp" method="get">
	더하기<br>
	숫자1 : <input type="text" name="number"/>
	숫자2 : <input type="text" name="number2"/>
	<input type="submit" value="전송"/>
	<hr>
</form>

<form action="${pageContext.request.contextPath }/jsp/mul.jsp" method="get">
	곱하기<br>
	숫자1 : <input type="text" name="number"/>
	숫자2 : <input type="text" name="number2"/>
	<input type="submit" value="전송"/>
</form>
</body>
</html>
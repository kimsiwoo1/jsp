<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="../js/jquery-3.4.1.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	$(function(){
		$('#${locale}').attr('selected', true);
		
		$('#frm').on('change', function(){
			$('#frm').submit();
		})
	})
</script>
<body>
<form id="frm" action="${cp }/selectLocale" method="get">
	<select name="locale">
		<option id="ko" value="ko">한국어</option>
		<option id="en" value="en">english</option>
		<option id="zh" value="zh">中国话</option>
	</select>
	<!--  <input type="submit" value="전송"/> -->
</form>

<fmt:setLocale value="${locale }"/>
<fmt:setBundle basename="kr.or.ddit.msg.message" var="msg"/>
<fmt:message key="GREETING" bundle="${ msg}"/><br>
</body>
</html>
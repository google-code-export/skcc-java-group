<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isELIgnored ="false" %>                   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form id="calcform" action="./CalculatorServlet">
	<input name="num1" type="text" size="2" value="${param.num1}"/>
	<select name="operator">
		<option label="+" value="+" ${param.operator == '+' ? 'selected':''}>
		<option label="-" value="-" ${param.operator == '-' ? 'selected':''}>
		<option label="*" value="*" ${param.operator == '*' ? 'selected':''}>
		<option label="/" value="/" ${param.operator == '/' ? 'selected':''}>
	</select>
	<input name="num2" type="text" size="2" value="${param.num2}"/>
	= 
	${result}
	<br/>
	<input type="submit" value="계산">
	</form>
</body>
</html>
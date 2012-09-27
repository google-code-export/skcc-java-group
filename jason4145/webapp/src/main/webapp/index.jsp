<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>                   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>Calculator Test</h1>
	<form id="calcform" action="./CalculatorServlet.do">
	<input name="num1" type="text" size="10" value="${param.num1}"/>
	<select name="operator">
		<option label="+" value="+" ${param.operator == '+' ? 'selected':''}>
		<option label="-" value="-" ${param.operator == '-' ? 'selected':''}>
		<option label="*" value="*" ${param.operator == '*' ? 'selected':''}>
		<option label="/" value="/" ${param.operator == '/' ? 'selected':''}>
	</select>
	<input name="num2" type="text" size="10" value="${param.num2}"/>
	= ${result}
	<br/>
	<input type="submit" value="계산">
</form>
</body>
</html>

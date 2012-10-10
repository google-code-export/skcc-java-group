<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isELIgnored ="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<% int res =0;
   String val1 = request.getParameter("val1");
   String val2 = request.getParameter("val2");
   
%>
</head>
<body>

<h3>과제5: New-WEB계산기 </h3>
<hr noshade>
<p>

<form method="get" action="calculator">
<input type = "text"  name="val1" size="10" value="${param.val1}">
<select name="operator" >
		<option label="/" value="/" ${param.operator == '/' ? 'selected':''}>
		<option label="+" value="+" ${param.operator == '+' ? 'selected':''}>
		<option label="-" value="-" ${param.operator == '-' ? 'selected':''}>
		<option label="*" value="*" ${param.operator == '*' ? 'selected':''}>
		
</select>
<input type = "text" name="val2" size="10" value="${param.val2}">

=
${res}

<br>
<input type = "submit" value="계산">


</form>
</body>
</html>
</body>

</html>
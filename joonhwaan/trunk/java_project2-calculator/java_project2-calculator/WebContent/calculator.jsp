<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>

<h3>과제4: WEB계산기 </h3>
<hr noshade>
<p>

<form method="get" action="calculator.do">
<input type = "text"  name="val1" size="10">
<select name="cal" >
<option>+
<option>-
<option>/
<option selected>*
</select>
<input type = "text" name="val2" size="10">

=
<input type = "text"  >

<br>
<input type = "submit" value="계산">


</form>
</body>
</html>
</body>

</html>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<% int res =0;
   String val1 = request.getParameter("val1");
   String val2 = request.getParameter("val2");

	res = (Integer)request.getAttribute("result");  
  
	
	
	System.out.println(res);
%>
</head>
<body>

<h3>����4: WEB���� </h3>
<hr noshade>
<p>

<form method="get" action="calculator.do">
<input type = "text"  name="val1" size="10" value=<%=val1 %>>
<select name="cal" >
<option>+
<option>-
<option>/
<option selected>*
</select>
<input type = "text" name="val2" size="10" value=<%=val1 %>>

=
<input type = "text" value= <%=res%> >

<br>
<input type = "submit" value="���">


</form>
</body>
</html>
</body>

</html>
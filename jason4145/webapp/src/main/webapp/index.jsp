<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<html>
<body>
<%	
	request.setCharacterEncoding("UTF-8");
	int result = 0;
	int num1 = 0;
	int num2 = 0;
	String operator = "minus";
	if(request.getAttribute("result") != null)
		result = (Integer)request.getAttribute("result");
	if(request.getAttribute("num1") != null)
		num1 = (Integer)request.getAttribute("num1");
	if(request.getAttribute("num2") != null)
		num1 = (Integer)request.getAttribute("num2");
%>
<h1>Calculator Test</h1>
<form method="POST" action="CalculatorServlet.do">
	<input name="num1" id="num1" size="10" value=<%=num1 %> />
	<select id="operator" name="operator" >
		<option value="plus"> + </option>
		<option value="minus"> - </option>
		<option value="multi"> * </option>
		<option value="divide"> / </option>
	</select>
	<input name="num2" id="num2" size="10" value=<%=num2 %> /> = <%=result %>
	<br>
	<input name="submit" type="submit">
</form>
</body>
</html>

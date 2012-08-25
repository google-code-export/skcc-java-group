<%@ page    language="java"
            contentType="text/html; charste=EUC-KR"
            pageEncoding="EUC-KR" %>

<%
    String id = request.getParameter("id");
    if (id == null) id = "";

    String msg = (String) request.getAttribute("msg");
    if (msg != null) {
%>
    <b><font color=red><%=msg%></font></b><br><br>
<%
    }
%>

<form method="post" action="/myweb/login.form">
<table>
    <tr>
        <td>아이디</td>
        <td><input type="text" name="id" value="<%=id%>"></td>
    </tr>
    <tr>
        <td>비밀번호</td>
        <td><input type="password" name="pw" ></td>
    </tr>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="로그인"></td>
    </tr>
</table>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title><spring:message code="easaycompany.loginform.title"/></title>
<link type="text/css" rel="stylesheet" href="/css/easycompany.css" />
</head>
<body>
로그인 페이지
<br/>
<br/>
<br/>
<br/>
<form:form commandName="account" action="loginProcess.do">
    아이디 : <input type=text name="id"> 
    패스워드: <input type=password name="password">
    <input type=submit value="로그인">
</form:form>
</body>
</html>
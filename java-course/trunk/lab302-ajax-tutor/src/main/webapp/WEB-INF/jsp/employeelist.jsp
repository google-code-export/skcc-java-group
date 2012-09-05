<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ajax" uri="http://ajaxtags.sourceforge.net/tags/ajaxtags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><spring:message code="easaycompany.employeelist.title"/></title>

<!--Ajax Tags-->
<script type="text/javascript" src="<%=request.getContextPath()%>/ajaxtags/js/prototype.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ajaxtags/js/scriptaculous/scriptaculous.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ajaxtags/js/overlibmws/overlibmws.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/ajaxtags/js/ajaxtags.js"></script>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/ajaxtags/css/ajaxtags.css" />
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/ajaxtags/css/displaytag.css" />

<link type="text/css" rel="stylesheet" href="/css/easycompany.css" />
</head>
<body>
<%//<jsp:include page="menu.html" flush="true"/>  %>
<br/>
<h2>AJAX : AutoComplete 기능 </h2>
<div id="searchform">
<form:form commandName="searchCriteria" action="employeelist.do">
<table width="80%" border="0">
<tr>
        <td>이름 : <form:input path="searchName"/></td>
</tr>
</table>
</form:form>
</div>

<!--Ajax Tags Script-->
<ajax:autocomplete 
  baseUrl="suggestName.do" 
  source="searchName" 
  target="searchName" 
  className="autocomplete" 
  minimumCharacters="1" />
<br/>
<br/>
<h2>AJAX : AutoSelected 기능 </h2>
<div id="editform">
<form:form commandName="employee">
<table>
    <tr>
        <td>부서번호 : </td>
        <td>
            <form:select path="superdeptid">
                <option value="">상위부서를 선택하세요.</option>
                <form:options items="${deptInfoOneDepthCategory}" />
            </form:select>
            </td><td>
            <form:select path="departmentid">
                <option value="">근무부서를 선택하세요.</option>
                <form:options items="${deptInfoTwoDepthCategory}" />
            </form:select>
        </td>
    </tr>

</table>
</form:form>
</div>

<ajax:select 
    baseUrl="autoSelectDept.do"  
    parameters="depth=2,superdeptid={superdeptid}" 
    source="superdeptid" 
    target="departmentid" 
    emptyOptionName="Select model"/>

</body>
</html>
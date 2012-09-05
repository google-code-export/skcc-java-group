<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Insert title here</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <!-- eGovFrame Common import -->        
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/EgovMobile.css" />" />
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery-1.6.2.min.js" />"></script>
        
		<script type="text/javascript"> 
			$(document).ready( function() {                    
				$("#actionsheet_dialog").click( function() {
					var btmItem = [{id : 'button1', value: "선택1"},
						{id : 'button2', value: "선택2"}];
					jActionSheet('선택하세요!', 'Action sheet Dialog', 'a', btmItem , function(r) {
						$('#actionsheetOut').text(r);
					});
				});
			});
		</script> 
		<script type="text/javascript"> 
			$(document).ready( function() {                    
				$("#alert_dialog").click( function() {
					jAlert('주의하세요!', 'Alert Dialog', 'a');
				});
			});         
		</script>
        <script type="text/javascript">
			$( document ).bind( "mobileinit", function(){
				$.mobile.page.prototype.options.degradeInputs.date = 'text';
			});
		</script>
        
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/EgovMobile.js" />"></script>

		<script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/datepicker/jquery.mobile.datebox.js" />"></script>
    </head>

    <body>

        <!-- page start -->
        <div data-role="page" data-theme="d" id="main" data-dom-cache="true">

            <!-- header start -->
            <div data-role="header" data-theme="b">
                <h1>UX Component 실습</h1>
                <div data-role="tabs">
					<ul>
						<li><a href="#buttonTab" class="ui-btn-active">Button</a></li>
						<li><a href="#dialogTab">Dialog</a></li>
						<li><a href="#listTab">List View</a></li>
						<li><a href="#formTab">Form</a></li>
						<li><a href="#pickerTab">Date Picker</a></li>
					</ul>
				</div>
            </div>
            <!-- header end -->

            <!-- content start -->
            <div data-role="content">
				<div id="buttonTab">
					<br>
	                <a href="http://m.egovframe.go.kr/mguide/guide/guide.do" target="home" data-role="button" data-inline="true" class="egov-btn-rectangle" data-theme="f" data-icon="info" data-iconpos="top">모바일 실행환경 가이드</a>
	                <!-- <a href="http://localhost/index.jsp" target="home" data-role="button" data-inline="true" class="egov-btn-rectangle" data-theme="f" data-icon="info" data-iconpos="top">모바일 실행환경 가이드</a> -->
	                <br>
	                <div data-role="controlgroup" data-type="horizontal"> 
		                <a href="/internalLinkPage.jsp" data-ajax="false" data-role="button" data-theme="e" data-icon="arrow-l">도메인 내부 링크</a>
		                <a href="#sub" data-role="button" data-theme="g"  data-icon="arrow-r" data-iconpos="right" data-rel="dialog" data-transition="flip">페이지 내부 링크</a>
					</div>
				</div>
				
				<div id="dialogTab">
					<br>
					<label for="actionsheet_dialog" class="center">You Entered : <strong id="actionsheetOut"></strong></label>
					<input id="actionsheet_dialog" type="button" value="Action Sheet" />
					<br>
					<input id="alert_dialog" type="button" value="Alert Dialog" />
				</div>
				
				
				<div id="listTab">
					<ul data-role="listview" data-inset="true" data-split-icon="forward" data-count-theme="e" data-filter="true">
						<li><a href="http://m.egovframe.go.kr/mguide/guide/guide.do" target="home">모바일 실행환경 가이드</a></li>
						<li>Nested List & Numbered List
							<ol data-role="listview" data-inset="true">
								<li>Americano</li>
								<li>Caffe Latte</li>
								<li>Caffe Mocha</li>
							</ol>
						</li>
						<li><a href="#">Split Button</a><a href="/internalLinkPage.jsp" data-ajax="false"></a></li>
						<li data-role="list-divider">List Divider</li>
						<li>Count Bubble<span class="ui-li-count">2200</span></li>
					</ul>
					
				</div>

	            <div id="formTab">
					<form id="form-1" action="#" method="get">
						<ul data-role="listview" data-inset="true">
							<li data-role="fieldcontain">
								<label for="text">아이디 :</label>
								<input type="text" id="text"/>
							</li>
							<li data-role="fieldcontain">
								<label for="password">비밀번호 :</label>
								<input type="password" id="password"/>
							</li>
							<li data-role="fieldcontain">
								<button id="submit" type="submit">로그인</button>
							</li>
						</ul>
					</form>
				</div>

	            <div id="pickerTab">
					<p>Date Picker</p>
					<input name="mydate" id="defandroid" type="date" data-role="datebox" data-options='{"mode": "calbox"}' />
					<br>
					<p>Time Picker</p>
					<input name="mydate" id="mydate" type="date" data-role="datebox" data-options='{"mode": "timebox", 	"timeFormat": 12}' />
				</div>
            </div>

            <!-- content end -->

            <!-- footer start -->
            <div data-role="footer" data-theme="b">
                <h4>m.egovframe.go.kr</h4>
            </div>
            <!-- footer end -->
            
        </div>
        <!-- page end -->

        <!-- page start -->
        <div data-role="page" data-theme="d" id="sub">

            <!-- header start -->
            <div data-role="header" data-theme="g">
                <h1>UX Component 실습</h1>
            </div>
            <!-- header end -->

            <!-- content start -->
            <div data-role="content">
            	<a href="#main">Go Main Page</a>
            </div>
            <!-- content end -->

        </div>
        <!-- page end -->
        
    </body>
    
</html>
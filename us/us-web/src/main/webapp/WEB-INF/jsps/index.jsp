<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@include file="common/common_cfg.jsp"%>
<html>
<body>
<h2>Hello World!</h2>
</body>
	<div>Hell World!</div>
	<c:if test="${userInfo!=null }">
		<div>${userInfo.userName },${userInfo.userId}</div>
	</c:if>
	
	<c:if test="${not empty arrUserInfo}">
		<c:forEach items="${arrUserInfo}" var="userInfo">   
			<div>${userInfo.userName },${userInfo.userId}</div><br/>
		 </c:forEach>
	</c:if>
	<form action="${base}/manage/test/submit/login" method="post">
		<input type="submit" value="登录" />
	</form>
	<shiro:hasRole name="数据管理员"> 
	<form action="${base}/manage/test/qry" method="post">
		数据管理员
		<c:if test="${not empty error }"><div>${error}</div></c:if>
		<input type="hidden" name="userId" value="gus48fIFQ-SBZnDaSo3TxQ">
		<input type="submit" value="搜索" />
	</form>
	</shiro:hasRole>
	<shiro:hasRole name="admin"> 
	<form action="${base}/manage/test/submit/obj" method="post">
		用户名：<input type="text" name="userName" value="111"/>
		用户ID：<input type="text" name="userId" value="aaa"/>
		<input type="submit" value="Submit" />
	</form>
	</shiro:hasRole>
	<form action="${base}/manage/test/submit/objList" method="post">
		用户名：<input type="text" name="arrUser[0].userName" value="333"/>
		用户ID：<input type="text" name="arrUser[0].userId" value="ccc"/>
		
		用户名：<input type="text" name="arrUser[1].userName" value="222"/>
		用户ID：<input type="text" name="arrUser[1].userId" value="bbb"/>
		<input type="submit" value="Submit" />
	</form>
</html>

<%@ page import="com.us.core.common.constant.ConfigureConstants" %>
<%
	String basePath = ConfigureConstants.urlConstantMap.get(ConfigureConstants.BASE_PATH);
	String staticPath = ConfigureConstants.urlConstantMap.get(ConfigureConstants.STATIC_PATH);
	request.setAttribute("base", basePath);
%>
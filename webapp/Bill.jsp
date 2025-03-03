<%@page import="com.squad.Pojo.Orders"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href = "templatemo_style.css" rel = "stylesheet" type = "text/css" />

</head>
<body>

<%
String uEmail = (String)session.getAttribute("uEmail");
String aEmail = (String)session.getAttribute("aEmail");
%>

<c:if test="${uEmail==null && aEmail==null }">
<jsp:include page="Header.jsp"></jsp:include>
</c:if>

<c:if test="${uEmail!=null && aEmail==null }">
<jsp:include page="UserHeader.jsp"></jsp:include>
</c:if>

<c:if test="${uEmail==null && aEmail!=null }">
<jsp:include page="AdminHeader.jsp"></jsp:include>
</c:if>

<div id= "templatemo_container" > 

<form class="main">
<% Orders od = (Orders)request.getAttribute("order"); %>
OrderId: <%=od.getOrderID() %> <br>
EmailId: <%=od.getEmailID() %> <br>
TotalPrice: <%=od.getTotalPrice() %> <br>
Date: <%=od.getOrderDate() %>

</form>

</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
<%@page import="java.util.Iterator"%>
<%@page import="com.squad.Pojo.Food"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String aEmail1 = (String)session.getAttribute("aEmail");
String uEmail1 = (String)session.getAttribute("uEmail");
List <Food> l = (List)session.getAttribute("flist");
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


<div id = "templatemo_container" class = "parent" >
<div class = "child" >

<form>

<br><h1>Food List</h1>

<table border = "1">

<tr>
<th>FoodId</th>
<th>FoodName</th>
<th>FoodType</th>
<th>Quantity</th>
<th>Price</th>


<c:if test="${uEmail==null && aEmail!=null }">
<th colspan = "2" >Action</th>
</c:if>

<c:if test="${uEmail!=null && aEmail==null }">
<th colspan = "1" >Action</th>
</c:if>

</tr>

<%
Iterator <Food> itr = l.iterator();

while(itr.hasNext()){
	Food f = itr.next();
%>
	
<tr>
<td><%=f.getFoodID() %></td>
<td><%=f.getFoodName() %></td>
<td><%=f.getFoodType() %></td>
<td><%=f.getFoodQuantity() %></td>
<td><%=f.getFoodPrice() %></td>


<c:if test="${uEmail==null && aEmail!=null }">
<td><a href = "UpdateFood.jsp?foodId=<%=f.getFoodID() %>"> Edit</a></td>
<td><a href = "Food?action=delete&foodId=<%=f.getFoodID() %>"> Delete</a></td>
</c:if>

<c:if test="${uEmail!=null && aEmail==null }">
<td><a href = "AddToCart.jsp?foodId=<%=f.getFoodID()%>&Fname=<%=f.getFoodName()%>" >Add</a></td>
</c:if>


</tr>
	
<%	
}
%>

</table>
</form>
</div>
</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
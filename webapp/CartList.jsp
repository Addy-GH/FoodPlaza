<%@page import="com.squad.Pojo.Cart"%>
<%@page import="java.util.Iterator"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href = "templatemo_style.css" rel = "stylesheet" type = "text/css" />

</head>
<body>

<% List<Cart>l = (List)session.getAttribute("cartlist"); %>

<jsp:include page="UserHeader.jsp"></jsp:include>

<div id = "templatemo_container" >

<form action="order" method="post" onsubmit="CartListValidation()" class="main">

<table border = "1" >
<caption>Cart List</caption>

<tr>
<th>CartId</th>
<th>FoodId</th>
<th>FoodName</th>
<th>EmailId</th>
<th>Quantity</th>
<th>FoodPrice</th>
<th>TotalPrice</th>
<th colspan = "1" >Cancel</th>
</tr>

<%
Iterator<Cart> itr = l.iterator();

while(itr.hasNext()){
	Cart ct = itr.next();
	
%>

<tr>
<td><%=ct.getCartID() %></td>
<td><%=ct.getFoodID() %></td>
<td><%=ct.getFoodName() %></td>
<td><%=ct.getEmailID() %></td>
<td><%=ct.getQuantity() %></td>
<td><%=ct.getFoodPrice() %></td>
<td><%=ct.getTotalPrice()  %></td>
<td><a href= "Cart?action=delete&cartId=<%=ct.getCartID() %>">Delete</a></td>
</tr>


<% 
}
%>

</table>

<input type = "submit" value = "Order" name = "action" >
<input type = "reset" value = "clear" >

</form>

</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
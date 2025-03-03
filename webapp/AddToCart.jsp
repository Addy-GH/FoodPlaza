<%@page import="com.squad.Pojo.Food"%>
<%@page import="com.squad.Dao.FoodDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<meta charset="UTF-8">
<title>AddToCart</title>

<script type="text/javascript" src = "Cart.js"  ></script>
<link href = "templatemo_style.css" rel = "stylesheet" type = "text/css" />
<script type="text/javascript " src = "Validation.js" ></script>

</head>
<body>

<jsp:include page="UserHeader.jsp"></jsp:include>

<%
FoodDaoImpl fd = new FoodDaoImpl();
Food food = new Food();
int foodid = Integer.parseInt(request.getParameter("foodId"));
food = fd.searchFoodById(foodid);
String emailId = (String)session.getAttribute("uEmail");

String fName = request.getParameter("Fname");
session.setAttribute("fName", fName);
%>

<div id = "templatemo_container" >
<form action="Cart" method = "post" onsubmit = "return AddCartValidation()" class = "main" > 

<table border = "1" >
<caption>AddToCart</caption>

<tr>
<td>Existing FoodId : </td>
<td><input type = "number" name = "fid" id = "fid" value = "<%=food.getFoodID()%>" ></td>
<td><span id = "fiderror" style = "color:red" ></span></td>
</tr>

<tr>
<td>EmailId : </td>
<td><input type = "email" name = "email" id = "email" value = "<%=emailId%>" ></td>
<td><span id = "emailerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>FoodName : </td>
<td><input type = "text" name = "fname" id = "fname" value = "<%=food.getFoodName()%>" ></td>
<td><span id = "fnameerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>FoodQuantity : </td>
<td><input type = "number" name = "fquantity" id = "fquantity" onkeyup="searchdatas(this.value)"></td>
<td><span id = "fquantityerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>FoodPrice : </td>
<td><input type = "number" name = "fprice" id = "fprice" value = "<%=food.getFoodPrice()%>"></td>
<td><span id = "fpriceerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>TotalPrice : </td>
<td><input type = "number" name = "tprice" id = "tprice" onmouseover="totall()"></td>
<td><span id = "tpriceerror" style = "color:red" ></span></td>
</tr>


</table>

<input type = "submit" value = "AddToCart" name = "action" >
<input type = "reset" value = "clear" >

</form>
</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
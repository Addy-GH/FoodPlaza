<%@page import="com.squad.Pojo.Food"%>
<%@page import="com.squad.Dao.FoodDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href = "templatemo_style.css" rel = "stylesheet" type = "text/css" />
<script type="text/javascript " src = "Validation.js" ></script>

</head>
<body>

<%
FoodDaoImpl fd = new FoodDaoImpl();
int id = Integer.parseInt(request.getParameter("foodId"));
Food f = fd.searchFoodById(id);
%>

<jsp:include page="AdminHeader.jsp"></jsp:include>

<div id = "templatemo_container" >
<form action="Food" method = "post" onsubmit = "return UpdateFoodValidation()" class = "main" > 

<table border = "1" >
<caption>Update Food</caption>

<tr>
<td>FoodID : </td>
<td><input type = "number" name = "fid" id = "fid" value = "<%=f.getFoodID() %>" ></td>
<td><span id = "fiderror" style = "color:red" ></span></td>
</tr>

<tr>
<td>FoodName : </td>
<td><input type = "text" name = "fname" id = "fname" value = "<%=f.getFoodName() %>" ></td>
<td><span id = "fnameerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>FoodType : </td>
<td><input type = "text" name = "ftype" id = "ftype" value = "<%=f.getFoodType() %>" ></td>
<td><span id = "ftypeerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>FoodQuantity : </td>
<td><input type = "number" name = "fquantity" id = "fquantity" value = "<%=f.getFoodQuantity() %>" ></td>
<td><span id = "fquantityerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>FoodPrice : </td>
<td><input type = "text" name = "fprice" id = "fprice" value = "<%=f.getFoodPrice() %>" ></td>
<td><span id = "fpriceerror" style = "color:red" ></span></td>
</tr>

</table>

<input type = "submit" value = "UpdateFood" name = "action" >
<input type = "reset" value = "clear" >

</form>
</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
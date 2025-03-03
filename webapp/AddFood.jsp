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

<jsp:include page="AdminHeader.jsp"></jsp:include>
<div id = "templatemo_container" class = "parent" >

<form action="Food" method = "post" onsubmit = "return AddFoodValidation()" class = "main" >

<table border = "1" >
<caption>Add Food</caption>

<tr>
<td>Food Type :</td>
<td><input type = "text" name = "ftype" id = "ftype" ></td>
<td><span id = "ftypeerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>Food Name :</td>
<td><input type = "text" name = "fname" id = "fname" ></td>
<td><span id = "fnameerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>Food Quantity :</td>
<td><input type = "text" name = "fquantity" id = "fquantity" ></td>
<td><span id = "fquantityerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>Food Price :</td>
<td><input type = "text" name = "fprice" id = "fprice" ></td>
<td><span id = "fpriceerror" style = "color:red" ></span></td>
</tr>

</table>

<input type = "submit" value = "AddFood" name = "action" >
<input type = "reset" value = "clear" >

</form>

</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
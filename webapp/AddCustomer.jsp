<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript " src = "Validation.js" ></script>

</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>

<div id = "templatemo_container" class = "parent" >

<form action="Customer" method = "post" onsubmit = "AddCustValidation()" class = "main" > 

<table border = "1" >

<caption>Add or Register Customer</caption>

<tr>
<td>Name :</td>
<td><input type = "text" name="cname" id = "cname" ></td>
<td><span id = "cnameerror"  style = "color : red" ></span></td>
</tr>

<tr>
<td>Email :</td>
<td><input type = "email" name="email" id = "email" ></td>
<td><span id = "emailerror"  style = "color : red" ></span></td>
</tr>

<tr>
<td>Password :</td>
<td><input type = "text" name="pass" id = "pass" ></td>
<td><span id = "passerror"  style = "color : red" ></span></td>
</tr>

<tr>
<td>Address :</td>
<td><input type = "text" name="adr" id = "adr" ></td>
<td><span id = "adrerror"  style = "color : red" ></span></td>
</tr>

<tr>
<td>Contact :</td>
<td><input type = "number" name="cno" id = "cno" ></td>
<td><span id = "cnoerror"  style = "color : red" ></span></td>
</tr>

</table>

<input type = "submit" value = "AddCustomer" name = "action" >
<input type = "reset" value = "Clear" >

</form>
</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
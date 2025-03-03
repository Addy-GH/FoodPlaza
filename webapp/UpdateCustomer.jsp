<%@page import="com.squad.Pojo.Customer"%>
<%@page import="com.squad.Dao.CustomerDaoImpl"%>
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
CustomerDaoImpl custdi = new CustomerDaoImpl();
String emailId = request.getParameter("emailId");
Customer cust = custdi.searchCustomerById(emailId);
%>

<jsp:include page="UserHeader.jsp"></jsp:include>

<div id = "templatemo_container" >

<form action="Customer" method = "post" onsubmit = "return UpdateCustomerValidation()" class = "main" >

<table border = "1" >
<caption>Update Customer</caption>

<tr>
<td>Name: </td>
<td><input type = "text" name = "cname" id = "cname" value = "<%=cust.getCustomerName() %>" ></td>
<td><span id = "cnamerror" style = "color:red" ></span></td>
</tr>

<tr>
<td>Email :</td>
<td><input type = "email" name="email" id = "email" value = "<%=cust.getCustomerEmailID() %>" ></td>
<td><span id = "emailerror"  style = "color : red" ></span></td>
</tr>

<tr>
<td>Password :</td>
<td><input type = "text" name="pass" id = "pass" value = "<%=cust.getCustomerPassword() %>" ></td>
<td><span id = "passerror"  style = "color : red" ></span></td>
</tr>

<tr>
<td>Address :</td>
<td><input type = "text" name="adr" id = "adr" value = "<%=cust.getCustomerAddress() %>" ></td>
<td><span id = "adrerror"  style = "color : red" ></span></td>
</tr>

<tr>
<td>Contact :</td>
<td><input type = "number" name="cno" id = "cno" value = "<%=cust.getCustomerContactNo() %>" ></td>
<td><span id = "cnoerror"  style = "color : red" ></span></td>
</tr>

</table>

<input type = "submit" value = "UpdateCustomer" name = "action" >
<input type = "reset" value = "Clear" >

</form>

</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
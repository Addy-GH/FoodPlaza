<%@page import="java.util.Iterator"%>
<%@page import="com.squad.Pojo.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href = "templatemo_style.css" rel = "stylesheet" type = "text/css" />
<script src = "Validation.ja"></script>

</head>
<body>

<% List<Customer>l = (List)session.getAttribute("custlist"); %>

<jsp:include page="AdminHeader.jsp"></jsp:include>

<div id = "templatemo_container" >

<form class="main">

<table border = "1" >
<caption>Customer List</caption>

<tr>
<th>Name</th>
<th>EmailId</th>
<th>Password</th>
<th>Address</th>
<th>ContactNo</th>
<th colspan = "1" >Action</th>
</tr>

<%
Iterator<Customer> itr = l.iterator();

while(itr.hasNext()){
	Customer cs = itr.next(); 
%>	


<tr>
<td><%=cs.getCustomerName() %></td>
<td><%=cs.getCustomerEmailID() %></td>
<td><%=cs.getCustomerPassword() %></td>
<td><%=cs.getCustomerAddress() %></td>
<td><%=cs.getCustomerContactNo() %></td>
<td><a href = "Customer?action=delete&emailId=<%=cs.getCustomerEmailID() %>" >Delete</a></td>
</tr>


<%
}
%>

</table>

</form>

</div>

<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>
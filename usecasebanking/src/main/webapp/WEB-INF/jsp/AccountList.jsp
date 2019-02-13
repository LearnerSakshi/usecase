<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" style="border-collapse:collapse" >
<tr><th>AccountId</th><th>Name</th><th>Email</th><th>Account Number</th><th>Balance</th>
<th>Type</th><th>Edit</th><th>Delete</th></tr>

<c:forEach var="listaccount" items="${listaccount}">
<tr>
<td>
<c:out value="${listaccount.accid}"></c:out></td>
<td><c:out value="${listaccount.name}"></c:out></td>
<td><c:out value="${listaccount.email}"></c:out></td>
<td><c:out value="${listaccount.accountnumber}"></c:out></td>
<td><c:out value="${listaccount.balance}"></c:out></td>
<td><c:out value="${listaccount.type}"></c:out></td>
<td><a href="editaccount?accid=${listaccount.accid}">Edit</a></td>
<td><a href="deleteaccount?accid=${listaccount.accid}">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>
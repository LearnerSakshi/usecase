<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.error {
	color: red;
	font-style: italic;
}

.container {
	margin-left: 30%;
}

tr, td {
	width: 200px;
	                text-align: center;
	                border: 1px solid black;
	                padding: 10px;
	margin:20px;
}
</style>
<div class="container">
	<form:form method="post" action="openacc" modelAttribute="account">
		<h1>New Account form</h1>
		<table>
			<tr>
				<form:hidden path="accid"></form:hidden>
				<td>Name:</td>
				<td><form:input path="name" id="name" required="required" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" id="email" /></td>
			</tr>
			<tr>
				<td>Account number:</td>
				<td><form:input path="accountnumber" id="accountnumber" required="required" /></td>
			</tr>
			<tr>
				<td>Balance :</td>
				<td><form:input path="balance" id="balance" required="required"/></td>
			</tr>
			
			<tr>
				<td>Contact Number:</td>
				<td><form:input path="balance" id="balance" required="required"/></td>
			</tr>
			
			<tr>
			<td>Account type:</td>
			<td><form:radiobutton path="type" value="current" label = "current" checked="checked"/></td>
			<td><form:radiobutton path="type" value="saving"  label = "saving"/></td>
			<td><form:radiobutton path="type" value="checking"  label = "checking"/></td>
			</tr>
		
			<tr>
				<td><br /></td>
				<td><input type="submit" class="btn btn-success" value="open account" /></td>
			
			</tr>
		</table>

	</form:form>
</div>

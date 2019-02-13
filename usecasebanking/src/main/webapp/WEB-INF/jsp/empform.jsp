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
	margin-left: 40%;
}

tr, td {
	width: 200px;
	                text-align: center;
	                border: 1px solid black;
	                padding:10px;
}
</style>
<div class="container">
	<form:form method="post" action="login" modelAttribute="user">
		<h1>Login form</h1>
		<table>
			<tr>
				<form:hidden path="id"></form:hidden>
				<td>Username:</td>
				<td><form:input path="username" id="username" required="required"/></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="password" id="password" required="required"/></td>
			</tr>
			<tr>
				<td><br /></td>
				<td><input type="submit" class="btn btn-success" value="login" /></td>
			</tr>
			
		</table>

	</form:form>
</div>

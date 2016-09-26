<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Login</title>
</head>
<body>
	<jsp:include page="_menu.jsp" />


	<h1>Login</h1>

	<!-- /login?error=true -->
	<c:if test="${param.error == 'true'}">
		<div style="color: red; margin: 10px 0px;">

			Login Failed!!!<br /> Reason :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}

		</div>
	</c:if>

	<h3>Enter user name and password:</h3>

	<form name='f'
		action="${pageContext.request.contextPath}/j_spring_security_check"
		method='POST'>
		<table>
			<tr>
				<td>Car Make:</td>
				<td><input type='text' name='carmake' value=''></td>
			</tr>
			<tr>
				<td>Car Model:</td>
				<td><input type='text' name='carmodel' value=''></td>
			</tr>

			<tr>
				<td>Car Year</td>
				<td><input type='text' name='caryear' value=''></td>
			</tr>
			<tr>
				<td>Car Color:</td>
				<td><input type='text' name='carcolor' value=''></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
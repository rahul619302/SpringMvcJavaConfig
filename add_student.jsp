<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h3>${message}</h3>
	<spring:form method="POST" action="addStudent.do" modelAttribute="student">
		<table>
			<tr>
				<td>Roll : </td>
				<td><spring:input path="roll"></spring:input></td>
			</tr>
			<tr>
				<td>Name : </td>
				<td><spring:input path="name"></spring:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Student"></input></td>
			</tr>
		</table>
	</spring:form>
</body>
</html>
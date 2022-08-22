<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

</head>
<body>
	<div class="container">
		<header>
			<h1>Student Report Card</h1>
		</header>
		<div class="starter-template">
			<h1>Student List</h1>
			<table>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Maths</th>
					<th>Social Studies</th>
					<th>Physics</th>
					<th>Chemistry</th>
					<th>Literature</th>
					<th>Optional Subject</th>
					<th>Optional marks</th>
				</tr>
				<c:forEach var="student" items="${students}">
					<tr>
						<td> <a href='/student?id=<c:out value="${student.studentId}"/>'>${student.studentId}</a></td>
						<td>${student.firstName}</td>
						<td>${student.lastName}</td>
						<td>${student.maths}</td>
						<td>${student.socialStudies}</td>
						<td>${student.physics}</td>
						<td>${student.chemistry}</td>
						<td>${student.literature}</td>
						<td>${student.optionalSubject.optionalSubjectName}</td>
						<td>${student.optionalSubjectMarks}</td>
					</tr>
				</c:forEach>

			</table>
			<a href="/add-student">add student</a>
		</div>
	</div>

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>
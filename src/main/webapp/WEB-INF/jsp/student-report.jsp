<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<style type="text/css">
label {
	display: inline-block;
	width: 200px;
	margin: 5px;
	text-align: left;
}

input[type=text], input[type=password], select {
	width: 200px;
}

input[type=radio] {
	display: inline-block;
	margin-left: 45px;
}

input[type=checkbox] {
	display: inline-block;
	margin-right: 190px;
}

button {
	padding: 10px;
	margin: 10px;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Student Report</h2>
		<table>
			<tr>
				<th>Name:</th>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<th>Grade</th>
				<td>${student.grade}</td>
			</tr>
			<tr>
				<th>Course</th>
				<th>Marks</th>
				<th>Grade</th>
				<th>Comments</th>
			</tr>
			<tr>
				<td>Maths:</td>
				<td>${student.maths}</td>
				<td>${gradesMap.maths}</td>
				<td>
					<c:if test="${gradesMap.maths == 'F'}"><p>Fail<p></c:if>
					<c:if test="${gradesMap.maths == 'A+'}"><p>Noteworthy achievement<p></c:if>
				</td>
			</tr>
			<tr>
				<td>Social Studies:</td>
				<td>${student.socialStudies}</td>
				<td>${gradesMap.socialstudies}</td>
				<td>
					<c:if test="${gradesMap.socialstudies == 'F'}"><p>Fail<p></c:if>
					<c:if test="${gradesMap.socialstudies == 'A+'}"><p>Noteworthy achievement<p></c:if>
				</td>
			</tr>
			<tr>
				<td>Physics:</td>
				<td>${student.physics}</td>
				<td>${gradesMap.physics}</td>
				<td>
					<c:if test="${gradesMap.physics == 'F'}"><p>Fail<p></c:if>
					<c:if test="${gradesMap.physics == 'A+'}"><p>Noteworthy achievement<p></c:if>
				</td>
			</tr>
			<tr>
				<td>Chemistry:</td>
				<td>${student.chemistry}</td>
				<td>${gradesMap.chemistry}</td>
				<td>
					<c:if test="${gradesMap.chemistry == 'F'}"><p>Fail<p></c:if>
					<c:if test="${gradesMap.chemistry == 'A+'}"><p>Noteworthy achievement<p></c:if>
				</td>
			</tr>
			<tr>
				<td>Literature:</td>
				<td>${student.literature}</td>
				<td>${gradesMap.literature}</td>
				<td>
					<c:if test="${gradesMap.literature == 'F'}"><p>Fail<p></c:if>
					<c:if test="${gradesMap.literature == 'A+'}"><p>Noteworthy achievement<p></c:if>
				</td>
			</tr>
			<tr>
				<td>${student.optionalSubject.optionalSubjectName}</td>
				<td>${student.optionalSubjectMarks}</td>
				<td>${gradesMap.optional}</td>
				<td>
					<c:if test="${gradesMap.optional == 'F'}"><p>Fail<p></c:if>
					<c:if test="${gradesMap.optional == 'A+'}"><p>Noteworthy achievement<p></c:if>
				</td>
			</tr>
			<tr>
				<td>Honor Roll Status: </td>
				<td><c:if test="${isHonor == 'true'}"><p>Congratulations! You have been enrolled in Honors program<p></c:if></td>
				
			</tr>
			
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
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
        <h2>Student Registration</h2>
        <form:form action="register" method="post" modelAttribute="student">
            <form:label path="firstName">First name:</form:label>
            <form:input path="firstName"/><br/>
            
            <form:label path="lastName">Last name:</form:label>
            <form:input path="lastName"/><br/>
             
            <form:label path="grade">Grade:</form:label>
            <form:input path="grade"/><br/>
            
            <form:label path="maths">maths:</form:label>
            <form:input path="maths"/><br/>
            
            <form:label path="socialStudies">socialStudies:</form:label>
            <form:input path="socialStudies"/><br/>  
            
            <form:label path="physics">physics:</form:label>
            <form:input path="physics"/><br/>
            
            <form:label path="chemistry">chemistry:</form:label>
            <form:input path="chemistry"/><br/>
            
            <form:label path="literature">literature:</form:label>
            <form:input path="literature"/><br/>
                
 
            <form:label path="optionalSubject">Optional Subject:</form:label>
            <form:radiobutton path="optionalSubject" value="1"/>Computer Science
            <form:radiobutton path="optionalSubject" value="2"/>Foreign language<br/>
            
            <form:label path="optionalSubjectMarks">Optional Subject Marks:</form:label>
            <form:input path="optionalSubjectMarks"/><br/>
             
            <form:button>Register</form:button>
        </form:form>
    </div>
</body>
</html>
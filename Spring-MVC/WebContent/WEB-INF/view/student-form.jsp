<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title> Student Registration Form</title>
</head>
<body>
	<!-- model attribute used to access student object we added to the model in the studentController class -->
	<form:form action="processForm" modelAttribute="student">
	
	<!-- path can be used because we have getters and setters for first and last name -->
	First name: <form:input path="firstName" />
	
	<br><br>
	
	Last name: <form:input path="lastName" />
	
	<br><br>
	
	<input type="submit" value="submit" />
	
	<!-- when the form is loaded spring will call student.getfirstName() and student.getlastName() -->
	<!-- when the form is submitted spring will call student.setfirstName() and student.setlastName() -->
	</form:form>



</body>








</html>
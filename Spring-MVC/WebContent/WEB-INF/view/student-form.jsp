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
	
	<br><br><br>
	
	<!-- must have getter and setter for country -->
	Country:<form:select path="country">
	<!-- using options tag to  populate options from list in student class -->
		<form:options items="${student.countryOptions}" />
	</form:select>
	
	<br><br><br>
	
	<!-- radio buttons for favorite language must have getter and setter for fav language -->
	
	Java<form:radiobutton path="favoriteLanguage" value="Java"/>
	C++<form:radiobutton path="favoriteLanguage" value="C++"/>
	Python<form:radiobutton path="favoriteLanguage" value="Python"/>
	PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
	.NET<form:radiobutton path="favoriteLanguage" value=".NET"/>
	
	<br><br>
	
	Linux<form:checkbox path="operatingSystems" value="Linux" />
	Microsoft<form:checkbox path="operatingSystems" value="Microsoft" />
	Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
	
	<br><br>
	<input type="submit" value="submit" />
	
	<!-- when the form is loaded spring will call student.getfirstName() and student.getlastName() -->
	<!-- when the form is submitted spring will call student.setfirstName() and student.setlastName() -->
	</form:form>



</body>








</html>
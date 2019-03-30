<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!-- tag gives access to for each tag for looping over a collection -->
<html>

<head>

	<title> Student Confirmation Form</title>
	
</head>
<body>

<hr>
<hr>

The Student is confirmed ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}

<br><br>

Favorite Language is ${student.favoriteLanguage}

<br><br>

Operating Systems

<!-- using jsp c foreach tag to loop over list of operating systems -->
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
	<li> ${temp} </li>
	</c:forEach>
</ul>
</body>
</html>
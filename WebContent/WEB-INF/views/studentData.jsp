<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="student-app.html">Home</a>
	<br><br><br>
	<form action="dataValidate.html">
		Roll Number : <input type="text" name="rollNumber" /> <br> 
		First Name : <input type="text" name="fName" /> <br> 
		Last Name : <input type="text" name="lName" /> <br> 
		Course Name : <input type="text" name="course" /> <br> 
		Mobile Number <input type="text" name="mobile" /> <br> 
		City :<input type="text" name="city" /> <br> 
		<input type="submit" />
	</form>
	
	<br > ${message }
</body>
</html>
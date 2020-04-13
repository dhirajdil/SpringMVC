<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
FirstName:<form:input path="firstname"/>
<form:errors path="firstname" cssClass="error"/>
<br><br>
LastName:<form:input path="lastname"/>
<br><br>
Country:
      <form:select path="country">
      <form:options items="${student.countryOption}"/>
    	
      </form:select>
      
   <br><br>
   Favorite Language:
   Java <form:radiobutton path="favoriteLanguage" value="Java"/>
   C# <form:radiobutton path="favoriteLanguage" value="C#"/>
   PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
   Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
   
   <br><br>
	Operating System:
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
 	Mac OS <form:checkbox path="operatingSystems" value="Mac Os"/>
 	MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
 	
<input type="submit" value="submit"/>
</form:form>
</body>
</html>
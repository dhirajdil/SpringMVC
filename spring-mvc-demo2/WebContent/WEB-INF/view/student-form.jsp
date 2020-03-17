<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
FirstName:<form:input path="firstname"/>
<br><br>
LastName:<form:input path="lastname"/>
<br><br>
Country:
      <form:select path="country">
      <form:option value="Brazil" label="Brazil"/>
      <form:option value="France" label="France"/>
      <form:option value="Germany" label="Germany"/>
      <form:option value="India" label="India"/>
      </form:select>
      
   <br><br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>
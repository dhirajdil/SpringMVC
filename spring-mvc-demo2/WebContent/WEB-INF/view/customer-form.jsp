<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Customer Registration Form</title>
<style>
.error{
.error{color:red}
}
</style>
</head>
<body>
<i>Fill out the form. Asterisk (*) means required.</i>
<form:form action="processForm" modelAttribute="customer">
FirstName:<form:input path="firstname"/>
		  <form:errors path="firstname" cssClass="error"/>
<br><br>
LastName(*):<form:input path="lastname"/>
<form:errors path="lastname" cssClass="error"/>


<br><br>
Free Passes:<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>
<br><br>
Postal Code:<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br><br>
Course Code:<form:input path="courceCode"/>
<form:errors path="courceCode" cssClass="error"/>

<input type="submit" value="submit"/>
</form:form>
</body>
</html>
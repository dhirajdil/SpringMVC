<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<header><h2>Spring-mvc Demo-Input Form</h2></header>
<body>
Student Name:${student.firstname}${student.lastname}
Country:${student.country} 
Fevority Language:${student.favoriteLanguage}

Operating System:
<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
<li> ${temp} </li>
</c:forEach>

</ul>
</form>
</body>
</html>
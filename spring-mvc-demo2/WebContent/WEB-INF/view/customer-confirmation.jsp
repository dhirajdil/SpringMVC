<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>
Customer-Confirmation
</title>
</head>
<body>
Customer is confirm: ${customer.firstname} ${customer.lastname} 
Free Passes:${customer.freePasses}
Postal Code:{customer.postalCode}
Course Code:{customer.courceCode}
</body>
</html>
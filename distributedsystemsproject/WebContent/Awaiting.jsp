<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><b>Dictionary Service</b></h1>
	
	Waiting for Response...
	<script>
  setTimeout(function() {
      document.location = "http://localhost:8080/distributedsystemsproject/Response.jsp";
  }, 1000); // <-- this is the delay in milliseconds
</script>
</body>
</html>
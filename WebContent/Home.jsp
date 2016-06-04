<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*, main.java.com.dev.model.Message"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Your Messages</h1>
	<div>
		<%
			List messages = (List) request.getAttribute("messages");
			Iterator iterator = messages.iterator();
			while (iterator.hasNext()) {
				out.println("<br>" + ((Message)(iterator.next())).getMessage());
			}
		%>
	</div>
</body>
</html>
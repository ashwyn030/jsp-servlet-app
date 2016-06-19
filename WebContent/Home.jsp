<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*, main.java.com.dev.model.Message, main.java.com.dev.model.Dog"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<%-- <body>
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
</body> --%>

<body>
	<table width="100%">
		<tr>
			<td colspan="2" bgcolor="#b5dcb3" align="right"><img
				src="../images/CYIENT.png" alt="CYIENT Logo" width="100" height="20">
				<label for="signOut" align="right">Welcome Rohan Verma ! <input
					id="signOut" type="submit" name="Sign Out" value="Sign Out"></td>
		</tr>
		<tr align="top">
			<td bgcolor="#aaa" width="50"><input id="myRequests"
				type="submit" value="My Requests"></td>
			<td bgcolor="#eee" height="550">
				<%-- <div>
		<%
			List messages = (List) request.getAttribute("messages");
			Iterator iterator = messages.iterator();
			while (iterator.hasNext()) {
				out.println("<br>" + ((Message)(iterator.next())).getMessage());
			}
			
			Dog dog=(Dog)request.getServletContext().getAttribute("dog");
			out.println("<br>" + dog.getBreed());
		%>
		</div> --%> <!-- <h1 align="top">Create a new request</h1>
				<div style="color: #0000FF">
				<label for="comboBox">Purpose</label>
					<select id="comboBox">
						<option value="officialo">Official</option>
						<option value="personal">Personal</option>
					</select>
				</div> -->
				<h1 align="top">Create a new request</h1>
				<div style="background-color: #aaa; color: white; padding: 20px;">
					<table width="100%">
						<tr>
							<td><label for="comboBox">Purpose</label></td>
							<td><select id="comboBox">
									<option value="official">Official</option>
									<option value="personal">Personal</option>	
							</select></td>
						</tr>
						<tr>
							<td><label for="startDate">Start Date</label></td>
							<td><input type="date" id="startDate"></td>
						</tr>
						<tr>
							<td><label for="endDate">End Date</label></td>
							<td><input type="date" id="endDate"></td>
						</tr>
						<tr>
							<td>
								<label for="totalDays">Total Days</label>
								<label id="totalDays">31 Days</label>
							</td>
						</tr>
					</table>
				</div>
				<!-- <div style="background-color: #aaa; color: white; padding: 20px;">
					<h1 align="top">Create a new request</h1>
				</div> -->
			</td>
		</tr>
		<tr>
			<td colspan="2" bgcolor="#b5dcb3">
				<center>Copyright © 2016</center>
			</td>
		</tr>
	</table>
</body>
</html>
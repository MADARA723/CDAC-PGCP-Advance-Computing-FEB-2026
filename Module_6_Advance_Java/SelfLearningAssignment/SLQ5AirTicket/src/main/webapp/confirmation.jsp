<%@ page session="true" %>

<html>
<body>

<h2>Ticket Confirmation</h2>

<hr>

User :
<%=session.getAttribute("username")%>

<br><br>

Flight :
<%=session.getAttribute("flight")%>

<br><br>

Source :
<%=session.getAttribute("source")%>

<br><br>

Destination :
<%=session.getAttribute("destination")%>

<br><br>

Passenger :
<%=session.getAttribute("passenger")%>

<br><br>

Age :
<%=session.getAttribute("age")%>

<br><br>

Gender :
<%=session.getAttribute("gender")%>

<br><br>

<h3>
Ticket Booked Successfully
</h3>

<a href="LogoutServlet">
Logout
</a>

</body>
</html>
<%@ page session="true" %>

<%
if(session.getAttribute("username")==null){
    response.sendRedirect("login.jsp");
}
%>

<html>
<body>

<h2>Select Flight</h2>

<form action="FlightServlet" method="post">

Flight :

<select name="flight">

<option>Air India AI101</option>

<option>Indigo 6E202</option>

<option>Vistara UK303</option>

</select>

<br><br>

Source :

<input type="text"
       name="source">

<br><br>

Destination :

<input type="text"
       name="destination">

<br><br>

<input type="submit"
       value="Next">

</form>

</body>
</html>
<%@ page session="true" %>

<html>
<body>

<h2>Passenger Details</h2>

<form action="PassengerServlet"
      method="post">

Passenger Name :

<input type="text"
       name="passenger">

<br><br>

Age :

<input type="text"
       name="age">

<br><br>

Gender :

<select name="gender">

<option>Male</option>

<option>Female</option>

</select>

<br><br>

<input type="submit"
       value="Book Ticket">

</form>

</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <title>Perfect Number</title>
</head>
<body>

<h2>Perfect Number Checker</h2>

<form method="POST" action="/check">
    <input type="number" name="num" required>
    <button type="submit">Check</button>
</form>

<% if(result){ %>
    <h3><%= result %></h3>
<% } %>

</body>
</html>
<html>
<head>
<title>Add Book</title>
</head>

<body>

<h2>Add Book</h2>

<form action="BookServlet" method="post">

<input type="hidden"
       name="action"
       value="add">

Book ID :
<input type="text"
       name="bookid">

<br><br>

Title :
<input type="text"
       name="title">

<br><br>

Author :
<input type="text"
       name="author">

<br><br>

Price :
<input type="text"
       name="price">

<br><br>

<input type="submit"
       value="Save Book">

</form>

</body>
</html>
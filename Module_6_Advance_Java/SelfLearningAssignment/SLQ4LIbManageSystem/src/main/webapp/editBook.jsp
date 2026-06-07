<%@ page import="com.library.model.Book" %>

<%
Book b =
(Book)request.getAttribute("book");
%>

<html>
<head>
<title>Edit Book</title>
</head>

<body>

<h2>Update Book</h2>

<form action="BookServlet" method="post">

<input type="hidden"
       name="action"
       value="update">

Book ID :

<input type="text"
       name="bookid"
       value="<%=b.getBookid()%>"
       readonly>

<br><br>

Title :

<input type="text"
       name="title"
       value="<%=b.getTitle()%>">

<br><br>

Author :

<input type="text"
       name="author"
       value="<%=b.getAuthor()%>">

<br><br>

Price :

<input type="text"
       name="price"
       value="<%=b.getPrice()%>">

<br><br>

<input type="submit"
       value="Update Book">

</form>

</body>
</html>
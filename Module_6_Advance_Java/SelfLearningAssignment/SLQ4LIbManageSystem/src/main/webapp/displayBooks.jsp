<%@ page import="java.util.*" %>
<%@ page import="com.library.model.Book" %>

<html>
<head>
<title>Book List</title>
</head>

<body>

<h2>All Books</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Price</th>
<th>Action</th>
</tr>

<%
List<Book> books =
(List<Book>)request.getAttribute("books");

for(Book b : books){
%>

<tr>

<td><%=b.getBookid()%></td>
<td><%=b.getTitle()%></td>
<td><%=b.getAuthor()%></td>
<td><%=b.getPrice()%></td>

<td>

<a href="BookServlet?action=edit&id=<%=b.getBookid()%>">
Edit
</a>

|

<a href="BookServlet?action=delete&id=<%=b.getBookid()%>">
Delete
</a>

</td>

</tr>

<%
}
%>

</table>

<br><br>

<a href="addBook.jsp">
Add New Book
</a>

</body>
</html>
<%@ page import="java.util.*" %>
<%@ page import="com.demo.model.Product" %>

<html>
<body>

<h2>Product List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Qty</th>
<th>Price</th>
<th>Action</th>
</tr>

<%
List<Product> plist =
(List<Product>)request.getAttribute("plist");

for(Product p : plist){
%>

<tr>

<td><%=p.getPid()%></td>
<td><%=p.getPname()%></td>
<td><%=p.getQty()%></td>
<td><%=p.getPrice()%></td>

<td>

<a href="ProductServlet?action=edit&pid=<%=p.getPid()%>">
Edit
</a>

|

<a href="ProductServlet?action=delete&pid=<%=p.getPid()%>">
Delete
</a>

</td>

</tr>

<%
}
%>

</table>

<br>

<a href="addProduct.jsp">
Add New Product
</a>

</body>
</html>
<%@ page import="com.demo.model.Product" %>

<%
Product p =
(Product)request.getAttribute("product");
%>

<html>
<body>

<h2>Update Product</h2>

<form action="ProductServlet" method="post">

<input type="hidden"
       name="action"
       value="update">

PID :

<input type="text"
       name="pid"
       value="<%=p.getPid()%>"
       readonly>

<br><br>

Name :

<input type="text"
       name="pname"
       value="<%=p.getPname()%>">

<br><br>

Quantity :

<input type="text"
       name="qty"
       value="<%=p.getQty()%>">

<br><br>

Price :

<input type="text"
       name="price"
       value="<%=p.getPrice()%>">

<br><br>

<input type="submit"
       value="Update Product">

</form>

</body>
</html>
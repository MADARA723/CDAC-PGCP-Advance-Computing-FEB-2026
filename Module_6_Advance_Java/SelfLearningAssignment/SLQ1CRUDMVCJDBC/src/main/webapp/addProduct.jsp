<html>
<body>

<h2>Add Product</h2>

<form action="ProductServlet" method="post">

<input type="hidden"
       name="action"
       value="add">

Product Id :
<input type="text" name="pid"><br><br>

Product Name :
<input type="text" name="pname"><br><br>

Quantity :
<input type="text" name="qty"><br><br>

Price :
<input type="text" name="price"><br><br>

<input type="submit"
       value="Save Product">

</form>

<br>

<a href="ProductServlet?action=view">
View Products
</a>

</body>
</html>
const express = require("express");
const fs = require("fs");

const app = express();
app.use(express.json());

// Read data
function readData() {
    return JSON.parse(fs.readFileSync("Q1_product.json"));
}

// Write data
function writeData(data) {
    fs.writeFileSync("product.json", JSON.stringify(data, null, 2));
}

// GET all products
app.get("/", (req, res) => {
    res.json(readData());
});

// GET product by id
app.get("/:id", (req, res) => {
    const products = readData();
    const product = products.find(p => p.prodid == req.params.id);

    product ? res.json(product) : res.send("Product not found");
});

// POST using params
app.post("/add", (req, res) => {
    const products = readData();

    const newProduct = {
        prodid: parseInt(req.query.prodid),
        ProductName: req.query.ProductName,
        price: parseInt(req.query.price)
    };

    products.push(newProduct);
    writeData(products);

    res.send("Product added using params");
});

// POST using body
app.post("/insert", (req, res) => {
    const products = readData();

    products.push(req.body);
    writeData(products);

    res.send("Product added using body");
});

// DELETE product
app.delete("/:id", (req, res) => {
    let products = readData();

    products = products.filter(p => p.prodid != req.params.id);
    writeData(products);

    res.send("Product deleted");
});

app.listen(3000, () => console.log("Server running"));
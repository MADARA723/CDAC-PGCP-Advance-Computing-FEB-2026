const express = require("express");
const app = express();

app.set("view engine", "ejs");
app.use(express.urlencoded({ extended: true }));

// Load page
app.get("/", (req, res) => {
    res.render("index", { result: null });
});

// Check perfect number
app.post("/check", (req, res) => {
    const num = parseInt(req.body.num);
    let sum = 0;

    for (let i = 1; i < num; i++) {
        if (num % i === 0) sum += i;
    }

    const result = (sum === num) ? "Perfect Number" : "Not Perfect Number";

    res.render("index", { result });
});

app.listen(3000, () => console.log("Server running"));
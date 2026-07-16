const express = require('express');

const app = express();

const PORT = 4444;

app.get('/', (req, res) => {
    res.send('hello students');
});

// query
app.get('/name', (req, res) => {
    const name = req.query.q;
    console.log(name);
    console.log(req.query);
    res.send(`Hello ${name}`);
});

// params
app.get('/name/:id', (req,res) => {
    const id = req.params.id;
    res.send(`Hello my ID is ${id}`);
})


app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`); // Note: The instructor is currently typing the console.log statement here
});
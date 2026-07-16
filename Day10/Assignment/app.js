const express = require('express');
const fs = require('fs');

const app = express();
const PORT = 8001;

let users = require("../Lec12/MOCK_DATA.json");

// Middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true}));

// HOME
app.get('/', (req, res)=>{
    res.send(`Server running on port ${PORT}`)
})

// GET All Users
app.get('/api/users', (req, res) => {
    return res.json(users);
})


app.listen(PORT, ()=> {
    console.log(`Server running on port ${PORT}`);
})
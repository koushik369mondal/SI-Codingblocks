const express = require('express');
const fs = require('fs');

const router = express.Router();

let users = require('../students.json');

// GET all
router.get('/', (req, res) => {
    return res.json(users);
});

// Get Particular
router.get('/:id', (req, res) =>{
    const id = req.params.id;
    console.log(typeof(id));
    const user = users.filter((item) => item.id === id);
    console.log(user);
    return res.json(user);
})


module.exports = router;
const express = require('express');
const fs = require('fs');

const router = express.Router();

let users = require('../students.json');

router.get('/', (req, res) => {
    return res.json(users);
});


module.exports = router;
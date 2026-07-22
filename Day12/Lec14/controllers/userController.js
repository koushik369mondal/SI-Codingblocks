const userSchema = require('../models/userModel');

// GET
async function getAllUsers(req, res) {
    const users = await userSchema.find();

    res.status(200).json(users);
}


// GET by id
async function getUserById(req, res) {
    const user = await userSchema.findById(req.params.id);

    res.status(200).json(user);
}


// POST
async function createUser(req, res) {

    if (!req.body.name || !req.body.rollno) {
        res.status(404).json("User Value not Presen");
    }

    const user = userSchema.create({
        name: req.body.name,
        age: req.body.age,
        mobile: req.body.mobile,
        rollno: req.body.rollno
    })

    res.status(201).json(user);
}

// PATCH


// DELETE



module.exports = { getAllUsers, getUserById, createUser };
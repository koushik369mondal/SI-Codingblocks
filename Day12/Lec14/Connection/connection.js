const mongoose = require('mongoose');

async function connectDB(){
    try {
        await mongoose.connect("mongodb://127.0.0.1:27017/students");

        console.log("Database Connected");
    } catch (error) {
        console.log(error);
    }
}

module.exports = connectDB;
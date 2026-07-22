const express = require('express');
const connectDB = require('./Connection/connection');
const userRoute = require('./routes/user.routes');

const app = express();

const PORT = 8003;

connectDB();

// middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use('/users', userRoute);

app.listen(PORT, () => {
    console.log("Server Started");
})
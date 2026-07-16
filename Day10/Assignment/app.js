const express = require('express');
const fs = require('fs');

const app = express();
const PORT = 8001;

// HOME
app.get('/', (req, res)=>{
    res.send(`Server running on port ${PORT}`)
})


app.listen(PORT, ()=> {
    console.log(`Server running on port ${PORT}`);
})
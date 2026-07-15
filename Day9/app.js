const express = require('express');

const app = express();

app.get('/', (req, res)=> {
    res.send('Hello World');
})



app.listen(7001, ()=> {
    console.log('Server started');
})
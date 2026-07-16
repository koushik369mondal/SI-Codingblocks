const http = require('http');

// //create server
// const myserver = http.createServer((req, res) => {
//     console.log("Hello")
//     res.end('hello student');
// })


const myserver = http.createServer((req, res) => {
    // console.log("Hello")
    // res.end('hello student');
    switch(req.url){
        case '/' : res.end('hello from server');
        break;
        case '/contact' : res.end('contact page');
        break;
        case '/about' : res.end('I am in about page');
        break;
        default : res.end('404 error');
        break;
    }
})




// server listen port
myserver.listen(7000, () => {
    console.log("Server started")
})
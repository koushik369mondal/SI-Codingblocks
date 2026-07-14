const fs = require('fs');

let filename = "song2.txt";

console.log("file is being created .... ");

fs.writeFile(filename, "file written successfully", function (err) {
    if (err) {
        console.log('file written successfully');
    }
})

console.log('i m another print statement ')

console.log('i m another print statement ')
console.log('i m another print statement ')
console.log('i m another print statement ')
console.log('i m another print statement ')
console.log('i m another print statement ')
console.log('i m another print statement ')
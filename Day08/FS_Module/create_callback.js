const fs = require('fs');

let fileName = 'song.txt';

console.log('FIle is being created ...');

fs.writeFileSync(fileName, 'Hello Welcome To My Guys');

console.log('FIle Created');

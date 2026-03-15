// 6) create file product.txt and write data in that file 
//   using sync and async methods . 

import fs from "fs"
fs.appendFileSync("write.txt","This is write file created and data appended 1 ");
fs.writeFileSync("write.txt","this is write file data firstly truncated previous file created new data ");
fs.appendFileSync("write.txt","this is appended data")

let data = "asbjbjsdfksadh";
fs.writeFile('write.txt', data, 'utf8', (err) => {
    if (err) {
        console.error('Error writing file:', err);
        return;
    }
    console.log('File written successfully!');
});
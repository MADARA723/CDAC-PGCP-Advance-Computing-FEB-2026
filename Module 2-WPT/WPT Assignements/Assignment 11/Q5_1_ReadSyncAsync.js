// 5) create file sample.txt add some data in that file 
//    and read that file in synchronus way as well as asynchronus way

//  File Handling Node 
import fs from "fs"
//current folder 
let content = fs.readFileSync("sample.txt", 'utf8');
console.log("From File ")
console.log(content)//Sync Read


fs.readFile("sample.txt",'utf8',(err,data)=>{

    if (err) console.log(err)
        console.log(data)
}

)//Async Read

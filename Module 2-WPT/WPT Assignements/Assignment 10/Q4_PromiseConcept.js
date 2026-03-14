// 4) understand promise concept and implement
// in your code 

let p= new Promise((res,rej)=>{
    if(true) res("Data from promise")
        rej("Rejected")

})
p.then((m)=>{console.log(m)})
.catch((e)=>{console.log(e)})

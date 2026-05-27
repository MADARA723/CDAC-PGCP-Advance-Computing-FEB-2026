// 1) Write a program to understand async and await mechanism 

async function call1() {

   console.log('Async Function....')
    return await Promise.resolve(24+96);
    
}
call1().then(function(result){
    console.log( result);
});


let promise1=new Promise((res,rej)=>{
    setTimeout(function(){
        res("Promise resolved");


    },4000);
    
});

async function asyncfunc()
{
    let result=await promise1;

    console.log(result);
    console.log("After promise")
}
asyncfunc();

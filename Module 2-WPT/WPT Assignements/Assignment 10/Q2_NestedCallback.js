// 2) Understande and write nested call back function (as shown in lecture)


console.log("Nested CallBacks");
function step1(callback){
    setTimeout(()=>{
        console.log(" Step 1 ");
        callback();
    },1000);
}
function step2(callback){
    setTimeout(()=>{
        console.log(" Step 2 ");
        callback();

    },2000);        
}
function step3(callback){
    setTimeout(()=>{
         console.log(" Step 3 ");
         callback();
    },4000);
}
function step4(callback){
    setTimeout(()=>{
         console.log(" Shashi ");
         callback();
    },5000);
}
function step5(callback){
    setTimeout(()=>{
         console.log(" Step 5 ");
         callback();
    },6000);
}

step1(() => {
    step2(() => {
        step3(() => {
            step4(()=>{
                step5(()=>{
                    setTimeout(() => {
                        console.log("All steps completed");
                    },10000);
            
                });

        });
        });
    });
});

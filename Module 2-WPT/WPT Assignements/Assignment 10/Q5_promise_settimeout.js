// 5) write a code which contains 
//    normal function 
//    setTimeout
//    Promise
//    Console.log()

// and understand execution sequence


// Normal function
function startTask() {
    console.log("Task started");

    // Promise with setTimeout
    let promise = new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Promise resolved after 2 seconds");
        }, 5000);
        
    });

    // Handling the promise
    promise.then((message) => {
        console.log(message);
    });
}

// Calling the normal function
startTask();

console.log("This runs before the promise resolves");
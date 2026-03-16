// 1) accept command line args in node js 
//    and display addition of even numbers from that
import process from 'process';

//console.log("Q1_CommandLine_args.js");
console.log(process.argv);
const a=parseInt(process.argv[3]);
const b=parseInt(process.argv[4]);

console.log(a+b);



//console.log(a+b);



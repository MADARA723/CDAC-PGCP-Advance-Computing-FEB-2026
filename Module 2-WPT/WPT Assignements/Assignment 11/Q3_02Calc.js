// 3) Write a function calculate to perform addition of numbers  from given string 
//    let d = '12345678as'  in calc.js file 


function calc()
{
    let d ='12345678asd';
    let sum=0;

    for( var i=0;i<d.length;i++)
    {
        if(!isNaN(d[i]))
        {
          sum+=parseInt(d[i]);
        }
    }
    console.log(`sum of ${d} is ${sum}`);
}

export {calc};
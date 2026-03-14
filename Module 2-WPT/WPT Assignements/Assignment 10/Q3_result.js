

function result(e,r,callback)
{
    if(e)
        {
            console.log(e.message);
        }
        else
            {
                console.log('result :'+r);
            }

           
}
function add(a,b,callback)
{
     callback(null,(a+b));
}
function substract(a,b,callback)
{
   callback(null,(a-b));
}
function multiply(a,b,callback)
{
    callback(null,(a*b));
}
function divide(a,b,callback)
{
    if(b!==0)
    {
    callback(null,(a/b));
    }
    else{
        callback(new Error("division by zero is not possible"));
    }
}


add(6,3,result);
substract(5,3,result);
multiply(4,9,result);
divide(9,3,result);

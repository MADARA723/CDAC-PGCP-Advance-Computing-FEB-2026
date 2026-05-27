import {useState} from "react";

function CounterFunc()
{
    let [cnt,setCnt]=useState(0);


    function handler()
    {
        cnt=cnt+1;
     setCnt(cnt);//cnt value change setter methods
     console.log(cnt);
    }

    
    
        return(
           <>
             <h3>Count :{cnt}</h3>
             <button value="Count" onClick={handler} >Click Me</button>
           </>

        );
    

}
export default CounterFunc;
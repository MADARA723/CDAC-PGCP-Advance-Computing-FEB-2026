import { useCallback,useState,useEffect } from "react";
const funcSet=new Set();

const CallBackPrev =()=>{
    const[cnt,setCnt]=useState(0);
    const[num,setNum]=useState(0);


    const incCnt =()=>
    {
        setCnt((prev)=>prev+1);
        setCnt((prev)=>prev+1);
    }

    // const decCnt =()=>
    // {
    //     setCnt((prev)=>prev-1);
    //     setCnt((prev)=>prev-1);
    // }
    // const numCnt =()=>
    // {
    //     setCnt((prev)=>prev-1);
    //     setCnt((prev)=>prev-1);
    // }
   // useEffect((),[num]);
    const decCnt = useCallback(() => setCnt(cnt - 1),
        [cnt]);
    const incNum = useCallback(() => setNum(num + 1), [num]);
    
    funcSet.add(incCnt);
    funcSet.add(decCnt);
    funcSet.add(incCnt);

    return (
        <div>

            <p>Count : {cnt}</p>
            <p> Count Number :{num}</p>
            <button onClick={incCnt}>Increment</button>
            <button onClick={decCnt}>Decrement</button>
            <button onClick={incNum}>Number</button>

        </div>  
    )
}
export default CallBackPrev;

// 4)with help of useEffect understand LifeCycle of Function Component 


import {useEffect,useState} from "react";

function FuncLife(){
    let[cnt,setCnt]=useState(0);

    function handeler(){
        setCnt(cnt++);
    }

    useEffect(()=>
    {
      alert("component Mounted on DOM");
    },[]);

    useEffect(()=>{

      alert("component render only once and Updated");
    },[cnt]);

    useEffect(()=>{
        alert("component unmounted");
    },[])



    return <>
           <h3> Count :{cnt}</h3>
           <button name="btn" value="Counter" 
                onClick={handeler}>Counter</button>
          </>

}

export default FuncLife;
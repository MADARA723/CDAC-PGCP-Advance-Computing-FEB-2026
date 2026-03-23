// 1) create RandomPassword Generator Function
// Component
// use useState , useEffect and useCallBack Hooks 
//  as discussed in Lecture 
import { useCallback,useEffect,useState } from "react";

    function PassGen()
    {
        let[pass,setPassword]=useState('');
        let[length,setLength]=useState(12);
        let[numbers,setNum1]=useState(false);
        let[symbols,setSym1]=useState(false);

        function GeneratePassword()
        {
            let characters ='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
            if (setNum1) characters +='0123456789';
            if (setSym1) characters +='!@#$%^&*()_+';

            let newPassword='';
            for(let i=0;i<length;i++)
            {
                newPassword +=characters.charAt(Math.floor(Math.random()*characters.length));
            }

            // state password 
        setPassword(newPassword);
        };
        useEffect(()=>{GeneratePassword()},
        [length,numbers,symbols]

       
        )
         useCallback(() => { GeneratePassword() },
        [length, numbers, symbols])

        return <>
                 <label>Password Length:</label> 
                <input type="number" name="length" value={length} onChange={(e)=>setLength(parseInt(e.target.value))} min="1" max="32"></input>
                <div>
                <input type="checkbox" name="number"  onChange={()=>setNum1(!numbers)}></input>
                Add Number
                </div>
                
                
                    <div>
                <input type="checkbox" name="symbol"  onChange={()=>setSym1(!symbols)}></input>
                Add Symbols
                </div>
                 <div>
                <button onBlur={GeneratePassword}>Generate Password</button>
                </div>
            
                <input type="text" value={pass} readOnly />
                
            

            </>
        

    }
    export default PassGen;

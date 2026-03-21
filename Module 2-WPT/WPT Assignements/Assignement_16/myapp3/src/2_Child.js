 
 import [useState] from "react"
 import DropCalc from './1_Parent';

 function Child(){
    let [Calc,showResult]=useState(['Add','Substraction','Division','Multiplication']);
    let[res,setRes]=useState(0);
         const num1 = parseFloat(number1) || 0;
    const num2 = parseFloat(number2) || 0;
    if(item==="Add"){
    setRes(num1 + num2);
    }
    
   return(
        <>
        {/* <input type='number'value={number1} onChange={handleNum1Change}></input>
        <input type='number' value={number2} onChange={handleNum2change}></input> */}
        <select>{Calc.map((item,index)=>
        <option key={index}>{item} onChange={}</option>)}
        </select>

       </>
   )
}

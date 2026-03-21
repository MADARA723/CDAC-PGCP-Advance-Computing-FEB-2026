
// 3) Create ParentComponent 
//    which accept data 2 numbers  and it will display result 
// Create ChildComponent which display options in DropDown Format 
//  add , subtraction , Division , Multiplication 
// after Option Selection onChange display result 
// on ParentComponent
import {useState} from "react";


function DropCalc(){
  function Parent(){
    let[number1,setNum1]=useState('');
    let[number2,setNum2]=useState('');
    
    function handleNum1Change(n1){
      return setNum1(n1.target.value);
    }
    function handleNum2Change(n2){
      return setNum2(n2.target.value);
    }
  }
  
  // function Child(){
  //   let [Calc,showResult]=useState(['Add','Substraction','Division','Multiplication']);
  //   let[res,setRes]=useState(0);
  //        const num1 = parseFloat(number1) || 0;
  //   const num2 = parseFloat(number2) || 0;
  //   setRes(num1 + num2);
  //   }
   return(
        <>
        <input type='number'value={number1} onChange={handleNum1Change}></input>
        <input type='number' value={number2} onChange={handleNum2change}></input>
        <select>{Calc.map((item,index)=>
        <option key={index}>{item}</option>)}
        </select>

       </>
   )




}
export default DropCalc;

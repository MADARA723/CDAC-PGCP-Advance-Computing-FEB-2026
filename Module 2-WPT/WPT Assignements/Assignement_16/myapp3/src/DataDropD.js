// 2) Declare variable which contains array Data 

// let data  = ['C' , 'C++' , 'Java' , 'AdvJava' , 'WPT']

// display above variable data in Dropdown format 
//  on html page 

import { useState } from "react";

function DropDown(){

    //let data= ['C','C++','Java','AdvJava','WPT'];

    let [data,setData]=useState(['C','C++','Java','AdvJava','WPT']);

    

    // function getDropData()
    // {
    //     let d=[];
    //     for(var i=0;i<data.length;i++)
    //     {
    //             let option =<option>{data[i]}</option>;
    //             d.push(option);
    //     }
    //     return d;

    // }


    return(
        <>
        <select >
            {data.map((item,index)=>(
                <option key={index}>{item} </option>
            ))}
        </select>
        </>
    );
}

export default DropDown;
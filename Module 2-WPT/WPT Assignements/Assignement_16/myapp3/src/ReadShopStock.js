// 5) Read the given file shopstock.json and display data
//  in table format on page when you click on LoadDataButton 

import {useState} from "react";

function ShopStock()
{
    let[elements,setElements]=useState([]);
    function LoadData()
    {
        fetch("/shopstock.json")
            .then(response=>response.json())
            .then(data=>setElements(data))
            .catch(error=>console.log(error));

    }

    return(
        <>
           <h1>Load Shop StOck Data</h1>

           <button onClick={LoadData}> Load Data</button>
        <table border="1">
            <thead>
                    <tr>
                        <th>ID</th>
                        <th>Item Name</th>
                        <th>Unit Cost</th>
                    </tr>
                </thead>
           <tbody >
                {elements.map((item, index) => (
                    <tr key={index}>                   
                    <td>{item.id}</td>
                    <td>{item.item_name}</td>
                    <td>{item.unit_cost}</td>
                    </tr>
                ))}       
                    
                </tbody>
         </table>
        </>
    )
}

export default ShopStock;
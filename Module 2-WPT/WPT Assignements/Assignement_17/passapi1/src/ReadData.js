// 2) Read Data From API using fetch method 
//    https://fakestoreapi.com/products

// and display data in Table Format 
// When page is loaded 

// use array.map method


import {useState} from "react";

function ReadData()
{
    let[elements,setElements]=useState([]);
    function LoadDat()
    {
        fetch("https://fakestoreapi.com/products")
            .then(response=>response.json())
            .then(data=>setElements(data))
            .catch(error=>console.log(error));

    }


    return(
        <>
           <h1>Load Product Data</h1>

           <button onClick={LoadDat}> Load Data</button>
        <table border="1">
            <thead>
                    <tr>
                        <th>ID</th>
                        
                        <th>Price</th>
                        <th>Description</th>
                        <th>Category</th>
                        <th>Image</th>
                        <th>rating</th>
                    </tr>
                </thead>
           <tbody >
                {elements.map((item, index) => (
                    <tr key={index}>                   
                    <td>{item.id}</td>
                    <td>{item.price}</td>
                    <td>{item.description}</td>
                    <td>{item.category}</td>
                    <td>
                        <img 
                        src={item.image} 
                        alt="product" 
                        width="50" 
                        />
                     </td>
                    <td>
                     {item.rating.rate} ({item.rating.count})
                     </td>
                    </tr>
                ))}       
                    
                </tbody>
         </table>
        </>
    )
}

export default ReadData;
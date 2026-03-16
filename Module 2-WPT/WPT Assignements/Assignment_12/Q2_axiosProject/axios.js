// 2) create folder axiosProject 
//      execute command 

//      npm install axios 

// after install that module 

// fetch api data using axios.get() method

import axios from "axios";
async function fetchData() {
    try{
        
    const response=await
    axios.get('https://api.example.com/data');
    
    //json
    console.log(response.data);
    }

    catch(error){
        console.log('Error Fetching data:',error);
    } 
}

fetchData();
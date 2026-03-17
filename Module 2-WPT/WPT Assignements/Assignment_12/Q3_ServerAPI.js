// 3)  
//  by using http module create server and run on port numer  - 5050 

//   create api  /
// 	   /index   --- > display <index page> on browser 
//                     /home --- > display <Home Page> on browser 

// 	/aboutus --> display <About US> using post method 

// hint  - use postman for post method 

const http=require('http');
const url =require('url')

const s1=http.createServer(handleData);

function handleData(request,response)
{
    const queryParams=url.parse(request.url,true).query;
    console.log(queryParams);


    if(request.method=='GET'){
        if(request.url=='/index'){
            response.write("<Index Page>")
        }
        
    }
    if(request.method=='POST'){

        const d=url.parse(request.url,true).query;
        console.log(d);

        let paramaters=d.query;
        let newData = JSON.stringify(paramaters);
        console.log(newData);
        if(request.url=='/home')
        {
            response.write("<Home Page>")
        }
        if(request.url=='/aboutus')
        {
            response.write("<About US>")
        }
    }
    response.end();
}

s1.listen(5555, () => {

    console.log("Server Started ")

});

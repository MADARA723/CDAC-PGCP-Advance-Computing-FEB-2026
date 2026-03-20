// 2) Create LoginForm using class component 
//     accept username and password 
//     and display
// 	 hello <username>  on same page 

// 	if username = "iet" and password = "iet"


import {Component} from ("react");

function LoginForm()
{
    constructor(){
        super();

        this.msg
    }
    btnHandler()
    {
    



    }



    textHandler(e)
    {
        console.log(e.target);



    }
    render()
    {
        return(
            <div>
                <input type="text" name="username"/>
                <input type="text" name="Password"/>



            </div>

        )
    }
}
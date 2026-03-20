// 2) Create LoginForm using class component 
//     accept username and password 
//     and display
// 	 hello <username>  on same page 

// 	if username = "iet" and password = "iet"


import { Component } from "react";

//JSX 
class Login extends Component {

    constructor() {
        super();
        //this.msg = "Default Msg"// instance 

        this.state = { msg: "default" }//state 

        this.textHandler = this.textHandler.bind(this);
          this.passwordHandler = this.passwordHandler.bind(this);

        //bind the event with current object variable 

    }

    btnHandler() {

        console.log("btnHandler")

    }
    // reading textfield data 
    //event 
    textHandler(e) {
        // console.log("textHandler")
        console.log(e.target);// element 
        console.log(e.target.name);
        
        console.log(e.target.value);// text onBlur 
        //this.msg = "New Msg " + e.target.value;
        this.setState({ msg: e.target.value })
        // instance 
        // bind problem   error undefined 
        return e.target.value;

    }

    passwordHandler(i){
        console.log(i.target);
        console.log(i.target.password);
        console.log(i.target.value);
       return i.target.value; 
    }
    validator()
    {
        if(this.textHandler=="iet" && this.passwordHandler=="iet")
        {
            alert("Login Succesfull");
        }
        else
        {
            alert("Invalid credentials");
        }
    }

    render() {

        return <>
            <h1>Login Form </h1>
            Enter UserName <input type="text"
                name="username" onBlur={this.textHandler} /><br />
        
            <p>Hello {this.state.msg}</p>

            
            <h1>password</h1>
            Enter password

            <input type="text" name="Password" onBlur={this.passwordHandler} /><br />

            <input type="button" value={"Login"}
                onClick={this.validator} />
            
        </>


    }
}

export default Login

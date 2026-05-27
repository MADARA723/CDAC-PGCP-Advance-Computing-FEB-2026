import { Component } from "react";

class Login extends Component {

    constructor() {
        super();

        this.state = {
            username: "",
            password: "",
            msg: ""
        };

        this.textHandler = this.textHandler.bind(this);
        this.passwordHandler = this.passwordHandler.bind(this);
        this.validator = this.validator.bind(this);
    }

    textHandler(e) {
        this.setState({ username: e.target.value });
    }

    passwordHandler(e) {
        this.setState({ password: e.target.value });
    }

    validator() {
        if (this.state.username === "iet" && this.state.password === "iet") {
            this.setState({ msg: "Login Successful" });
            alert("Login Successful");
        } else {
            this.setState({ msg: "Invalid Credentials" });
            alert("Invalid Credentials");
        }
    }

    render() {
        return <>
            <h1>Login Form</h1>

            Enter Username:
            <input type="text" onChange={this.textHandler} /><br />

            Enter Password:
            <input type="password" onChange={this.passwordHandler} /><br />

            <input type="button" value="Login" onClick={this.validator} />

            <p>Hello {this.state.username}</p>
            <p>{this.state.msg}</p>
        </>
    }
}

export default Login;

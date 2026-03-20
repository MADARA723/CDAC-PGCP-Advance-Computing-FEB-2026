
// 3) Write a code to understand lifecycle of class component 

import {Component} from "react";

class LifeCycle extends Component{
    
    constructor(){
    super();
    this.state={count:0};
    alert("1. Constructor is callled");
    }

    //Mounting phase

    componentDidMount()
    {
        alert("3. If Component Mounted (componentDidMount");
    }

    //Updating phase

    componentDidUpdate(prevProps,prevState)
    {
        alert("5. Component Update(componentDidUpdate");
        console.log("Previosu State:",prevState.count);
    }

    //Unmounting Phase
    componentWillUnmount()
    {
        alert("6.Component Will Unmount at the end");
    }

    increment=()=>
    {
        this.setState({count:this.state.count+1});
    }

    render()
    {
        alert(" 2. Render is called")
        return(
            <>
            <h1>LifeCycle</h1>
            <h2>Count: {this.state.count}</h2>
            <button onClick={this.increment}>Increase</button>
            </>
        );
    }
}

export default LifeCycle;

// 3) Create ParentComponent 
//    which accept data 2 numbers  and it will display result 
// Create ChildComponent which display options in DropDown Format 
//  add , subtraction , Division , Multiplication 
// after Option Selection onChange display result 
// on ParentComponent
import {Component} from "react"
//import {useState} from "react";
import Child from "./2_Child";


class Parent extends Component
{
  constructor()
  {
    super();
    this.calculate = this.calculate.bind(this);
    this.state={
      num1:"",
      num2:"",
      result:""
    };
  }
  handleNum1=(e)=>{
    this.setState({num1:e.target.value})
  }
  handleNum2=(e)=>
  {
    this.setState({num2:e.target.value})
  }

  calculate(operation){
    let n1=parseFloat(this.state.num1);
    let n2=parseFloat(this.state.num2);

    let res=0;

    switch(operation){
      case "add":
        res=n1+n2;
        break;
      case "sub":
        res=n1-n2;
        break;
      case "mul":
        res=n1*n2;
        break;
      case "div":
        res=n1/n2;
        break;
        
       default:
        res=0; 
    }

    this.setState({ result: res });
  }

  render()
  {
    return(
      <>
          <h1>Parent</h1>

          Enter Number 1:
          <input type="number" onChange={this.handleNum1}></input>

          Enter Number 2:
          <input type="number" onChange={this.handleNum2}></input>
          {/* Child Component */}
          <Child onOperation={this.calculate} />

          <h2>Result: {this.state.result}</h2>


      </>
    )
  }
}



export default Parent;

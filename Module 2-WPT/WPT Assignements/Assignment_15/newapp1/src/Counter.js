import { Component } from "react";

class Counter extends Component
{
  constructor(props)
  {
    super(props);
    this.btnHandlerIncrement=this.btnHandlerIncrement.bind(this);
    this.i=this.props.num1;
    this.state={cnt :0};
    this.btnHandlerDecrement=this.btnHandlerDecrement.bind(this);
    this.d=this.props.num2;
    this.state={decnt:0}
  }

  btnHandlerIncrement()
  {
    this.i++;
    this.setState({cnt:this.i});
  }

   btnHandlerDecrement()
  {
    this.d--;
    this.setState({decnt:this.d});
  }

  render()
  {

  return(
  <div>
    <p>Increment Count {this.state.cnt}</p>
    <button onClick={this.btnHandlerIncrement}>Click</button>
     <p>Decrement Counter {this.state.decnt}</p>
    <button onClick={this.btnHandlerDecrement}>Click</button>

  </div>
  );
  
 }

}
export default Counter;
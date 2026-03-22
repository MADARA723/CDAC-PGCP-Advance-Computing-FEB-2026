import { Component } from "react";

class Child extends Component{
    constructor() {
    super();
    this.handleChange = this.handleChange.bind(this);
}
    handleChange(e){
        let operation=e.target.value;

        this.props.onOperation(operation);
    }
    render()
    {
        return(
            <>
                <h3>Select Operation</h3>

                <select onChange={this.handleChange}>
                    <option value="">--Select--</option>
                    <option value="add">Addition</option>
                    <option value="sub">Subtraction</option>
                    <option value="mul">Multiplication</option>
                    <option value="div">Division</option>
                </select>
            </>
        )

    }
}
export default Child;

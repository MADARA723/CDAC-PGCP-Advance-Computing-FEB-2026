// Import Component from React (CommonJS style)
const { Component } = require("react");

export default class Counter extends Component {
    // Constructor: init instance vars, bind methods, set initial state
    constructor(props) {
        super(props);
        this.btnHandler = this.btnHandler.bind(this);  // Bind to fix 'this' context in event handler
        this.i = this.props.num1;  // Instance var from props (persists, no re-render trigger)
        this.state = { cnt: 0 };   // State var: triggers re-render on update
    }

    // Click handler: inc counter, update state -> re-render
    btnHandler() {
        this.i++;                  // Update instance var
        this.setState({ cnt: this.i });  // Mutate state -> React re-renders with new cnt
    }

    // Render: JSX returns UI, shows state.cnt, button calls handler
    render() {
        return (
            <>
                <p> Count  {this.state.cnt}</p>  {/* Displays current count */}
                <button onClick={this.btnHandler}>Click </button>  {/* Triggers handler */}
            </>
        );
    }
}

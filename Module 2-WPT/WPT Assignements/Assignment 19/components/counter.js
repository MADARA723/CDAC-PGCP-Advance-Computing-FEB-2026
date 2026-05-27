import React, { useReducer } from "react";

// Initial State
const initialState = { count: 0 };

// Reducer Function
function reducer(state, action) {
    switch (action.type) {
        case "increment":
            return { count: state.count + 1 };

        case "decrement":
            return { count: state.count - 1 };

        case "reset":
            return initialState;

        default:
            return state;
    }
}

// Function Component
function Counter() {
    const [state, dispatch] = useReducer(reducer, initialState);

    return (
        <div>
            <h2>Counter: {state.count}</h2>

            <button onClick={() => dispatch({ type: "increment" })}>
                Increment
            </button>

            <button onClick={() => dispatch({ type: "decrement" })}>
                Decrement
            </button>

            <button onClick={() => dispatch({ type: "reset" })}>
                Reset
            </button>
        </div>
    );
}

export default Counter;
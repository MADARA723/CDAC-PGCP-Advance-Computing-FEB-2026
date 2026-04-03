import React from "react";
import Todo from "./components/Todo";
import Counter from './components/counter';
import ClockBg from './components/ClockBg';

function App() {
    return (
        <div>
            <Todo />
             <Counter></Counter>
             <ClockBg>
                
             </ClockBg>

        </div>

    )
   
}

export default App;
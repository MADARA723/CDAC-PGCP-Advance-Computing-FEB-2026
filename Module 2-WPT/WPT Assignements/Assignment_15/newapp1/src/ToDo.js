// 4) Accept TO DO tasks in text field and display 
//    tasks in Ordered List on same page on buttonclick
//    in class

import { Component } from "react";

class TodoApp extends Component {

    constructor() {
        super();

        this.state = {
            task: "",
            tasks: []
        };

        this.handleChange = this.handleChange.bind(this);
        this.addTask = this.addTask.bind(this);
    }

    // Handle input field
    handleChange(e) {
        this.setState({ task: e.target.value });
    }

    // Add task to list
    addTask() {
        if (this.state.task.trim() !== "") {
            this.setState({
                tasks: [...this.state.tasks, this.state.task],
                task: "" // clear input
            });
        }
    }

    render() {
        return (
            <>
                <h1>TO-DO List</h1>

                Enter Task:
                <input 
                    type="text" 
                    value={this.state.task}
                    onChange={this.handleChange} 
                />

                <button onClick={this.addTask}>Add Task</button>

                <h2>Tasks:</h2>

                <ol>
                    {this.state.tasks.map((t, index) => (
                        <li key={index}>{t}</li>
                    ))}
                </ol>
            </>
        );
    }
}

export default TodoApp;
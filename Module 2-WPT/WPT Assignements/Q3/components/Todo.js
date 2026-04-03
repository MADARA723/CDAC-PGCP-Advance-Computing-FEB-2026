import React, { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { addTodo, deleteTodo } from "../redux/todoSlice";

function Todo() {
    const [text, setText] = useState("");
    const todos = useSelector(state => state.todos);
    const dispatch = useDispatch();

    return (
        <div>
            <h2>Todo List</h2>

            <input
                value={text}
                onChange={(e) => setText(e.target.value)}
            />

            <button onClick={() => {
                if (text.trim() === "") return;
                dispatch(addTodo(text));
                setText("");
            }}>
                Add
            </button>

            <ul>
                {todos.map(todo => (
                    <li key={todo.id}>
                        {todo.text}
                        <button onClick={() => dispatch(deleteTodo(todo.id))}>
                            Delete
                        </button>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Todo;
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
    const [todos, setTodos] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/api/todos')
            .then(response => setTodos(response.data))
            .catch(error => console.error('Error fetching todos', error));
    }, []);

    return (
        <div className="App">
            <h1>Todo App</h1>
            <ul>
                {todos.map(todo => (
                    <li key={todo.id}>{todo.title}</li>
                ))}
            </ul>
        </div>
    );
}

export default App;

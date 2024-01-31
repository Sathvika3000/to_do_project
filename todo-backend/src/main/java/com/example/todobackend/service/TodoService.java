package com.example.todobackend.service;

import com.example.todobackend.model.Todo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    public List<Todo> getTodos() {
        // Your logic to fetch and return todos
        return Arrays.asList(
                createTodo(1, "Task 1", false),
                createTodo(2, "Task 2", true),
                createTodo(3, "Task 3", false)
        );
    }

    private Todo createTodo(long id, String title, boolean completed) {
        Todo todo = new Todo();
        todo.setId(id);
        todo.setTitle(title);
        todo.setCompleted(completed);
        return todo;
    }
}

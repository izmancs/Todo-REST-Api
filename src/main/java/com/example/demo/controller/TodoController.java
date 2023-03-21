package com.example.demo.controller;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable("id") int id) {
        return todoService.getTodoById(id);
    }

    @PostMapping("/todos")
    public Todo addNewTodo(@RequestBody Todo todo) {
        return todoService.addNewTodo(todo);
    }

    @PutMapping("/todos/{id}")
    public Todo updateTodoById(@PathVariable int id, @RequestBody Todo todo) {
        return todoService.updateTodoById(id,todo);
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodoById(@PathVariable int id) {
        todoService.deleteTodoById(id);
    }
}

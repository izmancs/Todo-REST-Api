package com.example.demo.service;

import com.example.demo.entity.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getAllTodos();

    public Todo addNewTodo(Todo todo);

    public Todo getTodoById(int id);

    public Todo updateTodoById(int id, Todo todo);

    public void deleteTodoById(int id);
}

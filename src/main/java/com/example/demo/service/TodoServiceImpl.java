package com.example.demo.service;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo addNewTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo getTodoById(int id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public Todo updateTodoById(int id, Todo todo) {
        Todo todoDB = todoRepository.findById(id).get();

        if(Objects.nonNull(todo.getTitle()) && !"".equalsIgnoreCase(todo.getTitle()))
            todoDB.setTitle(todo.getTitle());

        if(Objects.nonNull(todo.getDescription()) && !"".equalsIgnoreCase(todo.getDescription()))
            todoDB.setDescription(todo.getDescription());

        if(Objects.nonNull(todo.getDueDate()) && null !=todo.getDueDate())
            todoDB.setDueDate(todo.getDueDate());

        if(Objects.nonNull(todo.getCompleted()) && null != todo.getCompleted())
            todoDB.setCompleted(todo.getCompleted());

        return todoRepository.save(todoDB);
    }

    @Override
    public void deleteTodoById(int id) {
        todoRepository.deleteById(id);
    }
}

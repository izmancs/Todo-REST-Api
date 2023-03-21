package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

//  TODO SAMPLE QUESTION

//	Create a Spring Boot application that exposes a REST API endpoint for a todo list. The endpoint should support the following operations:
//
//		1. Get all todos
//		2. Get a single todo by id
//		3. Add a new todo
//		4. Update an existing todo
//		5. Delete a todo by id
//
//	The todo model should have the following fields:
// 		- id (integer)
//		- title (string)
//		- description (string)
//		- dueDate (date)
//		- completed (boolean)
//
//	The application should use an in-memory H2 database to store the todos.
//
//	You can use any Spring Boot version and any database driver. You may use any additional libraries or frameworks as needed.
//
//	Write unit tests for each of the REST API endpoints to ensure they behave as expected.
//
//	Function signatures:
//		- List<Todo> getAllTodos()
//		- Todo getTodoById(int id)
//		- Todo addNewTodo(Todo todo)
//		- Todo updateTodoById(int id, Todo todo)
//		- void deleteTodoById(int id)
//
//	Example usage:
//	getAllTodos() => [Todo1, Todo2, Todo3]
//	getTodoById(2) => Todo2
//	addNewTodo(Todo4) => Todo4
//	updateTodoById(2, Todo5) => Todo5
//	deleteTodoById(1) => null

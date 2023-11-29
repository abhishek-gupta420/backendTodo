package com.abhishek.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardCodedService {
    private static List<Todo> todos = new ArrayList<>();
    private static long idCounter = 0;
    static  {
        todos.add(new Todo(++idCounter, "Abhi", "Learn java", new Date(), false));
        todos.add(new Todo(++idCounter, "Abhi", "Learn Microservices", new Date(), false));
        todos.add(new Todo(++idCounter, "Abhi", "Go to Gym", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo deleteById(long id) {
        Todo todo = findBYId(id);
        if (null == todo) {
            return null;
        }
        todos.remove(todo);
        return todo;
    }

    public Todo findBYId(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }

        return null;
    }

    public Todo save(Todo todo) {
        if (todo.getId() == -1 || todo.getId() == 0) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

}

package com.sabel.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {

    private static List<ToDo> todos = new ArrayList<>();

    static {
        todos.add(new ToDo("Java EE lernen"));
        todos.add(new ToDo("BA lernen"));
        todos.add(new ToDo("Tanzen lernen"));
    }

    public ToDoService() {

    }

    public List<ToDo> retrieveTodos() {
        return todos;
    }



}

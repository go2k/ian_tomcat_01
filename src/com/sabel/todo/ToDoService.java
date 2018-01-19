package com.sabel.todo;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void add(ToDo toDo) {
        todos.add(toDo);
    }

    public void delete(ToDo toDo) {
        todos.remove(toDo);
    }

    public void loesche(String name) {
        Iterator<ToDo> iterator = todos.iterator();

        while (iterator.hasNext()) {
            ToDo toDo = iterator.next();
            if (toDo.getName().equals(name)) {
                iterator.remove();
            }
        }
    }
}

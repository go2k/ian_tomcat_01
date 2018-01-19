package com.sabel.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ToDo {

    private String name;
    private static List<ToDo> todos = new ArrayList<>();


    public ToDo(String name) {
        this.name = name;
    }

    public ToDo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return Objects.equals(name, toDo.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    public void add(ToDo toDo) {
        todos.add(toDo);
    }
}

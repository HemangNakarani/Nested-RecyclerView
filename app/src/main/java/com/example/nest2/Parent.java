package com.example.nest2;

import java.util.ArrayList;

public class Parent {

    String title;
    ArrayList<Child> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Child> getList() {
        return list;
    }

    public void setList(ArrayList<Child> list) {
        this.list = list;
    }

    public Parent(String title, ArrayList<Child> list) {
        this.title = title;
        this.list = list;
    }
}

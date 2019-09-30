package com.example.nest2;

import java.util.ArrayList;

public class OuterList {


    ArrayList<Parent> parentArrayList ;

    public ArrayList<Parent> getParentArrayList() {
        return parentArrayList;
    }

    public void setParentArrayList(ArrayList<Parent> parentArrayList) {
        this.parentArrayList = parentArrayList;
    }

    public OuterList(ArrayList<Parent> parentArrayList) {
        this.parentArrayList = parentArrayList;
    }
}

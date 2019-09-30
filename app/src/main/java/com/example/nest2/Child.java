package com.example.nest2;

public class Child {

    String name;
    int imgId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public Child(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }
}

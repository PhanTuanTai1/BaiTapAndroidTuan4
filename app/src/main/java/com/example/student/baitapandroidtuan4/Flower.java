package com.example.student.baitapandroidtuan4;

public class Flower {
    private String name;
    private int Img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

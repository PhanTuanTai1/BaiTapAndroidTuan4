package com.example.student.baitapandroidtuan4;

public class FootballPlayer {
    private String name;
    private int year;
    private int imgAVT;
    private int imgCountry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImgAVT() {
        return imgAVT;
    }

    public void setImgAVT(int imgAVT) {
        this.imgAVT = imgAVT;
    }

    public int getImgCountry() {
        return imgCountry;
    }

    public void setImgCountry(int imgCountry) {
        this.imgCountry = imgCountry;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.year;
    }
}

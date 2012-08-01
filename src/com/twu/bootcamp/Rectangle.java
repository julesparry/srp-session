package com.twu.bootcamp;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return width * 2 + length * 2;
    }
}

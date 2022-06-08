package com.company;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return 2*(length+width);
    }

    @Override
    public void draw() {
        System.out.println("▯");
    }
}

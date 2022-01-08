package com.codegym;

public class Rectangle {
    double width, height;

    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    public String disPlay(){
        return "This width "+this.width+" and this height "+this.height;
    }
}

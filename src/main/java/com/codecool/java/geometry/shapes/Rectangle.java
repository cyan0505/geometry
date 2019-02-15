package com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    public float a;
    public float b;

    public Rectangle(float a, float b) {
        checkIfArgsGreaterThanZero(a,b);
        this.a = a;
        this.b = b;
        super.name = "Rectangle";
        super.areaFormula = "2a + 2b";
        super.perimeterFormula = "a×b";
    }

    public double calculateArea(){
        double area = a*b;
        return area;
    }

    public double calculatePerimeter(){
        double perimiter = 2*a + 2*b;
        return perimiter;
    }

    public String toString(){
        return "Rectangle, a = " + this.a + ",b = " + this.b;
    }

    public float getA(){
        return this.a;
    }

    public float getB(){
        return this.b;
    }

}


package com.codecool.java.geometry.shapes;

public class Square extends Rectangle {

    public Square(float a) {
        super(a,a);
        super.name = "Square";
        super.areaFormula = "a^2";
        super.perimeterFormula = "4a";
    }

    public double calculateArea(){
        return super.calculateArea();
    }

    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }

    public String toString(){
        return "Square, a = " + this.a;
    }

    public float getA(){
        return this.a;
    }
}

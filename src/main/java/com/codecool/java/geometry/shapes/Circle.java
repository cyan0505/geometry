package com.codecool.java.geometry.shapes;
import java.lang.Math.*;

public class Circle extends Shape {
    private float r;


    public Circle(float r) {
        checkIfArgsGreaterThanZero(r);
        this.r = r;
        super.areaFormula = "pi*r^2";
        super.perimeterFormula = "2*pi*r";
        super.name = "Circle";
    }

    public double calculateArea(){
        return Math.PI * Math.pow(this.r, 2);
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * r;
    }

    public String toString(){
        return "Circle, r = " + this.r;
    }

    public float getR(){
        return this.r;
    }
}   


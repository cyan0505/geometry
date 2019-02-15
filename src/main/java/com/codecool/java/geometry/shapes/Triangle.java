package com.codecool.java.geometry.shapes;
import java.lang.Math.*;

public class Triangle extends Shape {
    public float a;
    public float b;
    public float c;

    public Triangle(float a, float b, float c) {
        checkIfArgsGreaterThanZero(a,b,c);
        this.a = a;
        this.b = b;
        this.c = c;
        super.name = "Triangle";
        super.areaFormula = "sqrt(s(s-a)(s-b)(s-c))";
        super.perimeterFormula = "a + b + c";
    }

    public double calculateArea(){
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        return area;
    }

    public double calculatePerimeter(){
        double perimiter = a + b + c;
        return perimiter;
    }

    public String toString(){
        return "Triangle, a = " + this.a + ",b = " + this.b + ",c = " + this.c;
    }

    public float getA(){
        return this.a;
    }

    public float getB(){
        return this.b;
    }

    public float getC(){
        return this.c;
    }
}

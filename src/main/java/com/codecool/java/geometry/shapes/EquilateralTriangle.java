package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(float a) {
        super(a,a,a);
        super.name = "Equilateral Triangle";
        super.areaFormula = "sqrt(s(s-a)(s-b)(s-c))";
        super.perimeterFormula = "a + b + c";
    }

    public double calculateArea(){
        return super.calculateArea();
    }

    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }

    public String toString(){
        return "EquilateralTriangle, a = " + this.a;
    }

    public float getA(){
        return this.a;
    }

}

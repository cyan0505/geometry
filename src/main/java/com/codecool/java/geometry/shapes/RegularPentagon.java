package com.codecool.java.geometry.shapes;
import java.lang.Math.*;

public class RegularPentagon extends Shape {
    public float a;
    

    public RegularPentagon(float a) {
        checkIfArgsGreaterThanZero(a);
        this.a = a;
        super.name = "Regular Pentagon";
        super.areaFormula = "a^2*sqrt(5(5+2sqrt(5))))/4";
        super.perimeterFormula = "5a";
    }

    public double calculateArea(){
        double b = 5*(5 + 2*Math.sqrt(5));
        double area = (Math.pow(a, 2) * Math.sqrt(b))/4;
        return area;
    }

    public double calculatePerimeter(){
        double perimiter = 5*a;
        return perimiter;
    }

    public String toString(){
        return "RegularPentagon, a = " + this.a;
    }

    public float getA(){
        return this.a;
    }

}


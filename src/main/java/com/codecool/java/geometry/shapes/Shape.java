package com.codecool.java.geometry.shapes;

/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
    String name;
    String areaFormula;
    String perimeterFormula;


    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract String toString();


    public static boolean checkIfArgsGreaterThanZero(float... args) {
        for (float arg : args) {
            if (arg <= 0){
                throw new IllegalArgumentException("All arguments must be greater than 0");
            }
        }
        return true;
    }

    public String getPerimeterFormula(){
        return this.perimeterFormula;
    }

    public String getAreaFormula(){
        return this.areaFormula;
    }

    public String getName(){
        return this.name;
    }
}

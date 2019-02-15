package com.codecool.java.geometry.containers;

import java.util.*;
import com.codecool.java.geometry.shapes.Shape;

public class ShapeList {

    private List<Shape> shapes = new ArrayList<>();

    public ShapeList() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public Shape getShapeAt(int index) {
        return shapes.get(index);
    }

    public String getShapesTable() {
        String tableInfo = "";
        int tableLen = 125;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = this.getShape(i);
            
            String className = shape.getName();
            String parametherInfo = shape.toString();
            double perimeter = shape.calculatePerimeter();
            double area = shape.calculateArea();
            String perimeterFormula = shape.getPerimeterFormula();
            String areaFormula = shape.getAreaFormula();

            for (int j = 0; j < tableLen; j++) {
                tableInfo += "-";
            }
            tableInfo += "\n";

            Formatter formatter = new Formatter();
            tableInfo += formatter.format("%2d | %19s | %35s | %6.2f | %10s | %6.2f | %27s |\n", i, className,
                    parametherInfo, perimeter, perimeterFormula, area, areaFormula);
        }

        for (int j = 0; j < tableLen; j++) {
            tableInfo += "-";
        }
        tableInfo += "\n";
        System.out.println(tableInfo);
        return tableInfo;
    }

    public Shape getLargestShapeByPerimeter() {
        Shape largestPerimiterShape = this.shapes.get(0);
        for (Shape element : this.shapes) {
            if (element.calculatePerimeter() > largestPerimiterShape.calculatePerimeter()) {
                largestPerimiterShape = element;
            }
        }
        return largestPerimiterShape;
    }

    public Shape getLargestShapeByArea() {
        Shape largestAreShape = this.shapes.get(0);
        for (Shape element : this.shapes) {
            if (element.calculateArea() > largestAreShape.calculateArea()) {
                largestAreShape = element;
            }
        }
        return largestAreShape;
    }

    public int howLong() {
        int length = this.shapes.size();
        return length;
    }

    public Shape getShape(int i) {
        return this.shapes.get(i);
    }

    
}

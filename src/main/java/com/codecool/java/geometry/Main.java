package com.codecool.java.geometry;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ShapeList shapes = new ShapeList();
	    boolean isRunning = true;

	    while (isRunning) {
            Scanner scan = new Scanner(System.in);
            System.out.println("What do you want to do? \n  (1) Add new shape\n  (2) Show all shapes\n  (3) Show shape with the largest perimeter\n  (4) Show shape with the largest area\n  (5) Show formulas\n  (0) Exit program");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    chooseOption(shapes);
                    break;
                case 2:
                    shapes.getShapesTable();
                    break;
                case 3:
                    System.out.println("\n" + shapes.getLargestShapeByPerimeter().toString() + "\n");
                    break;
                case 4:
                    System.out.println("\n" + shapes.getLargestShapeByArea().toString() + "\n");
                    break;
                case 5:
                    System.out.println("You got that in table");
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }
    private static void chooseOption(ShapeList shapes) {
        System.out.println("What shape u wanna add? \n 1.Circle \n 2.Trianlge \n 3.Equilateral triangle \n 4.Rectangle \n 5.Square \n 6.Pentagon");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
 
        switch (option) {
        case 1:
            shapes.addShape(new Circle(getVariable("give r:")));
            break;
        case 2:
            shapes.addShape(new Triangle(getVariable("give a"),getVariable("give b:"), getVariable("give c:")));
            break;
        case 3:
            shapes.addShape(new EquilateralTriangle(getVariable("give a:")));
            break;
        case 4:
            shapes.addShape(new Rectangle(getVariable("give a:"),getVariable("give b:")));
            break;
        case 5:
            shapes.addShape(new Square(getVariable("give a:")));
            break;
        case 6:
            shapes.addShape(new RegularPentagon(getVariable("give a:")));
            break;
        }
    }
 
    private static int getVariable(String variableName) {
        System.out.println(variableName);
        Scanner scanner = new Scanner(System.in);
        int variable = 0;
        try {
            variable = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("This isn't a number!");
        }
        return variable;
    }
}

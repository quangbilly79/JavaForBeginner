package javacourse.section20OOPpart2;

import java.lang.Math;
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}


// TODO: Create a Circle class that extends Shape
// The Circle class should have a private double radius attribute and a constructor to initialize it
// It should also implement the calculateArea() method 

class Circle extends Shape {
    double radius;
    // Nhớ bổ sung ttin constructor của super class
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double calculateArea() {
        return radius*radius*Math.PI;
    }
}

// TODO: Create a Rectangle class that extends Shape
// The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
// It should also implement the calculateArea() method 

class Rectangle1 extends Shape {
    double width;
    double length;
    // Nhớ bổ sung ttin constructor của super class
    public Rectangle1(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }
    public double calculateArea() {
        return width*length;
    }
}
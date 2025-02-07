package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;  // Circle-ийн талбарын тооцоолол
    }

    @Override
    public void draw() {
        // Circle-ийн дүрсийг зурж үзүүлэх
        System.out.println("Drawing Circle with radius " + radius);
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

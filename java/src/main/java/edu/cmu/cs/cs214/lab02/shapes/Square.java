package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;  // Square-ийн талбарын тооцоолол
    }

    @Override
    public void draw() {
        // Square-ийн дүрсийг зурж үзүүлэх
        System.out.println("Drawing Square with side " + side);
    }

    // Getter for side
    public double getSide() {
        return side;
    }

    // Setter for side
    public void setSide(double side) {
        this.side = side;
    }
}

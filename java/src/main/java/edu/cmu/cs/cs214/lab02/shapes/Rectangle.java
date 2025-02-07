package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        // Rectangle-ийн дүрсийг зурж үзүүлэх хэрэгтэй
        System.out.println("Drawing Rectangle with height " + height + " and width " + width);
    }

    // Getters and Setters for height and width
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

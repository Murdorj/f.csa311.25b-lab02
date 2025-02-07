package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape;  // Shape интерфейсийг ашиглана

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        double area = shape.getArea();  // Shape-ийн талбарыг авна
        shape.draw();  // Тухайн Shape-ийг зурна

        // Дүрсний талбар болон дүрсийг хэвлэх
        System.out.println("Shape printed\nIts area is " + area);
    }
}

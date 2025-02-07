package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        // Rectangle объект үүсгэж өгнө
        Shape rectangle = new Rectangle(2, 3);  // Тусгай shape гэж явуулж байна

        // Renderer-ийн объект үүсгэж Shape-ийн объект хийгээд өгнө
        Renderer renderer = new Renderer(rectangle);

        // Draw хийх
        renderer.draw();
    }
}

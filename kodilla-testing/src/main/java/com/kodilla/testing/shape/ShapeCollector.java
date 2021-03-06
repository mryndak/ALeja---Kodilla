package com.kodilla.testing.shape;

import java.util.List;
import java.util.ArrayList;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }


    public boolean removeFigure(Shape shape) {
        boolean containsShape = false;
        if(shapes.contains(shape)) {
             shapes.remove(shape);
             return true;
        }
        return false;
    }


    public Shape getFigure(int n) {
        return shapes.get(n);
    }


    public void showFigures() {
        System.out.print("The list of shapes: ");
        for(Shape shape : shapes) {
            System.out.print(shape);
        }
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}

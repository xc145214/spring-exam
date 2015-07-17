package com.xc.spring1.beans;

/**
 * Created by Administrator on 2015/7/17.
 */
public class ShapePainter {
    private Shape shape;
    private String color;

    public ShapePainter() {
        System.out.println("ShapePainter has been initiated with default constructor!");
    }

    public ShapePainter(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
        System.out.println("ShapePainter has been created color = " + color);
    }

    public void paint() {
        System.out.println("Shape has been painted with " + color + " color");
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

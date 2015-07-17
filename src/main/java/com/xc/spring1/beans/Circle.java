package com.xc.spring1.beans;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Circle implements Shape {
    double radius;

    public Circle() {
        System.out.println("circle hase been created!");
    }

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Circle has been created radius = " + radius);
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void area() {
        System.out.println("Area = " + Math.PI * Math.pow(radius, 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

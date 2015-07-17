package com.xc.spring3;


import com.xc.spring3.shapes.Circle;

/**
 * Created by Administrator on 2015/7/17.
 */
public class ShapeBox {
    public ShapeBox() {
    }

    private Circle circle;

    public ShapeBox(Circle circle) {
        System.out.println("ShapeBox autowire " + circle.getId() + " by constructor");
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
        System.out.println("ShapeBox autowire "+circle.getId()+" by "+circle.getAutowire());
    }

}

package com.xc.spring3.shapes;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Circle {
    private String autowire;
    private String id;

    public String getId() {
        return id;
    }

    public String getAutowire() {
        return autowire;
    }

    public void setAutowire(String autowire) {
        this.autowire = autowire;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Circle() {
    }
}

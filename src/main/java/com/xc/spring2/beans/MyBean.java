package com.xc.spring2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/7/17.
 */
@Component(value = "myBean2")
public class MyBean {
    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    @Value(value = "AnnotationBean")
    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

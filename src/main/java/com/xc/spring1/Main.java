package com.xc.spring1;

import com.xc.spring1.beans.Circle;
import com.xc.spring1.beans.ShapePainter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Administrator on 2015/7/17.
 */
public class Main {
    public static void main(String[] args) {
        //º”‘ÿ≈‰÷√Œƒº˛
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config1.xml");

        //get circle bean defined in spring-config.xml file
        Circle circle =(Circle)ctx.getBean("circle");
        ShapePainter sp = (ShapePainter) ctx.getBean("shapePainter");

        //do something with the bean
        circle.draw();
        circle.area();
    }
}

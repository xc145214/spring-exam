package com.xc.spring6;

import com.xc.spring6.config.SpringConfigDev;
import com.xc.spring6.vo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Main {

    public static  void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
         ctx.getEnvironment().setActiveProfiles("development");
        //ctx.scan("com.xc.spring6");
        ctx.register(SpringConfigDev.class);
        ctx.refresh();

        Person person = (Person)ctx.getBean("person");

        System.out.print("person" + person.toString());
    }
}

package com.xc.spring2;

import com.xc.spring2.beans.AnotherBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctxXML = new ClassPathXmlApplicationContext("spring-config2.xml");

        AnotherBean anotherBean = (AnotherBean)ctxXML.getBean("anotherBean");
        System.out.println(anotherBean);
    }
}

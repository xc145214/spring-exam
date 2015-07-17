package com.xc.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctxXML = new ClassPathXmlApplicationContext("spring-config3.xml");
    }
}

package com.xc.spring5;

import com.xc.spring5.beans.Login;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config5.xml");

        Login login = (Login) ctx.getBean("login");
        login.login();
    }

}

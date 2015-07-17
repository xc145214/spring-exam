package com.xc.Aop2.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import java.util.Calendar;

/**
 * Created by Administrator on 2015/7/17.
 */
@Aspect
public class Logger {

    @After("execution(* com.xc.Aop2.beans.User.login(..))")
    public void log(){
        System.out.println("user has logged in @"+ Calendar.getInstance());
    }
}

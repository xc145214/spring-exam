package com.xc.Aop1.beans;

import java.util.Calendar;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Logger {
    public void log(){
        System.out.println("user has logged in @"+ Calendar.getInstance().getTime());
    }
}

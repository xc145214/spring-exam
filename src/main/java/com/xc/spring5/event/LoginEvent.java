package com.xc.spring5.event;

import org.springframework.context.ApplicationEvent;


import java.util.Date;

/**
 * Created by Administrator on 2015/7/17.
 */
public class LoginEvent extends ApplicationEvent {
    private Date date;


    public LoginEvent(Object source) {
        super(source);
        this.date = new Date(getTimestamp());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

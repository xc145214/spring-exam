package com.xc.spring5.beans;

import com.xc.spring5.event.LoginEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Login implements ApplicationEventPublisherAware {
    private String userName;

    private ApplicationEventPublisher publisher;

    public String getUserName() {
        return userName;
    }

    public void login(){
        //do the login..

        //fire the event
        LoginEvent event = new LoginEvent(this);
        publisher.publishEvent(event);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

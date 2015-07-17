package com.xc.spring5.beans;



import com.xc.spring5.event.LoginEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2015/7/17.
 */
public class LoginTracker implements ApplicationListener<LoginEvent> {
    public void onApplicationEvent(LoginEvent event) {
        System.out.println("\n"+((Login)event.getSource()).getUserName()+" logged-in @ "+event.getDate()+"\n");
    }
}

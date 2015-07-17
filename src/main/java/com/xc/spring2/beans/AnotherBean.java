package com.xc.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/7/17.
 */
@Component(value = "anotherBean")
public class AnotherBean {
    private MyBean myBean;

    public MyBean getMyBean() {
        return myBean;
    }

    @Autowired
    @Qualifier("myBean2")
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    @Override
    public String toString() {
        return "AnotherBean{" +
                "myBean=" + myBean +
                '}';
    }
}

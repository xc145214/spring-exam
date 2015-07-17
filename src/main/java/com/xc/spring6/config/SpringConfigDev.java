package com.xc.spring6.config;

import com.xc.spring6.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Administrator on 2015/7/17.
 */
@Configuration
@Profile("development")
public class SpringConfigDev {

    @Bean
    public Person person(){
        Person person =  new Person();
        person.setId(1);
        person.setName("dev-person");

        return person;
    }

}

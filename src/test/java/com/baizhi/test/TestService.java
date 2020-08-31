package com.baizhi.test;

import com.baizhi.service.AService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

    @Test
    public   void   testService1(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        AService aService=(AService) ac.getBean("aService");
        aService.modifysave();
    }
}

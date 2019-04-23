package com.swe.ui;

import com.swe.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        CustomerService cs1 = (CustomerService) ac.getBean("customerService");
        CustomerService cs2 = (CustomerService) ac.getBean("customerService");
        System.out.println(cs1==cs2);
    }
//    public static void main(String[] args) {
//        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
//        CustomerService cs = (CustomerService) ac.getBean("customerService");
//        System.out.println(cs);
//        cs.saveCustomer();
//    }
}

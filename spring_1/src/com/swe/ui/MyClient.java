package com.swe.ui;

import com.swe.dao.CustomerDao;
import com.swe.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring入门案例
 */
public class MyClient {
    /**
     * ClassPathXmlApplicationContext:它只能加载类路径的配置文件
     * FileSystemXmlApplicationContext:它可以加载磁盘任意位置的配置文件
     * @param args
     */
    public static void main(String[] args){
        //1.获取ioc容器
        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        CustomerService customerService = ((CustomerService) ac.getBean("customerService"));
        System.out.println(customerService);
        CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
        System.out.println(customerDao);

    }
}

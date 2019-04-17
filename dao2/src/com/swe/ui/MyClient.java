package com.swe.ui;

import com.swe.factory.BeanFactory;
import com.swe.service.CustomerService;
import com.swe.service.impl.CustomerServiceImpl;

/**
 * 模拟表现层，调用业务层
 */
public class MyClient {
    public static void main(String[] args){
//        CustomerService customerService= new CustomerServiceImpl();
//        CustomerService customerService=BeanFactory.getCustomerService();
        for (int i=0;i<5;i++){
            CustomerService customerService= ((CustomerService) BeanFactory.getBean("CUSTOMERSERVICE"));
            System.out.println(customerService);
        }
//            customerService.saveCustomer();

    }
}

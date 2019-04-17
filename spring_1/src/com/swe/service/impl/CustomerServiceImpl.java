package com.swe.service.impl;

import com.swe.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

//    private CustomerDao customerDao = new CustomerDaoImpl();

//     private CustomerDao customerDao=BeanFactory.getCustomerDao();

//    private CustomerDao customerDao= ((CustomerDao) BeanFactory.getBean("CUSTOMERDAO"));

    @Override

    public void saveCustomer() {
        System.out.println("业务层调用持久层");
    }
}

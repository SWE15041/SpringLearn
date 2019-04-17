package com.swe.service.impl;

import com.swe.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

//    private CustomerDao customerDao = new CustomerDaoImpl();

//     private CustomerDao customerDao=BeanFactory.getCustomerDao();

//    private CustomerDao customerDao= ((CustomerDao) BeanFactory.getBean("CUSTOMERDAO"));

    public CustomerServiceImpl(){
        System.out.println("CustomerServiceImpl bean对象创建成功");
    }
    @Override
    public void saveCustomer() {
        System.out.println("业务层调用持久层");
    }

    public void init(){
        System.out.println("CustomerServiceImpl bean对象初始化");
    }

    public void destory(){
        System.out.println("CustomerServiceImpl bean对象初销毁");
    }

}

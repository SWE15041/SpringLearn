package com.swe.service.impl;

import com.swe.service.CustomerService;

import java.util.Date;

public class CustomerServiceImpl implements CustomerService {
    private  String driver;
    private Integer port;
    private Date today;

    public CustomerServiceImpl(String driver, Integer port, Date today) {
        this.driver = driver;
        this.port = port;
        this.today = today;
    }

    @Override
    public void saveCustomer() {

        System.out.println("业务层调用持久层"+driver+","+port+","+today) ;
    }


}

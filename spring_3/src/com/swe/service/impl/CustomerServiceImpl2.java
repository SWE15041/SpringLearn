package com.swe.service.impl;

import com.swe.service.CustomerService;

import java.util.Date;

public class CustomerServiceImpl2 implements CustomerService {
    private  String driver;
    private Integer port;
    private Date today;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    @Override
    public void saveCustomer() {

        System.out.println("业务层调用持久层"+driver+","+port+","+today) ;
    }


}

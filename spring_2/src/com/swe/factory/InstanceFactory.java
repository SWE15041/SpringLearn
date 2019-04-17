package com.swe.factory;

import com.swe.service.CustomerService;
import com.swe.service.impl.CustomerServiceImpl;

/**
 * 模拟静实例工厂
 */
public class InstanceFactory {
    public   CustomerService getCustomerService(){
        return new CustomerServiceImpl();
    }
}

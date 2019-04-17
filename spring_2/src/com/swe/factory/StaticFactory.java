package com.swe.factory;

import com.swe.service.CustomerService;
import com.swe.service.impl.CustomerServiceImpl;

/**
 * 模拟静态工厂
 */
public class StaticFactory {
    public static CustomerService getCustomerService(){
        return new CustomerServiceImpl();
    }
}

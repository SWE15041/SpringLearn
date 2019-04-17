package com.swe.service;

import com.swe.domain.Customer;

import java.util.List;

public interface CustomerService {

    /**
     * 查找所有的客户
     * @return
     */
    List<Customer> findAllCustomer();

    /**
     * 保存所有的客户
     * @param customer
     */
    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long  custId);

    Customer findCustomerById(Long custId);
}

package com.swe.dao;

import com.swe.domain.Customer;

import java.util.List;

/**
 * 客户持久层接口
 */
public interface CustomerDao {
    Customer findCustomerById(Long custId);

    void deleteCutomer(Long custId);

    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer);

    List<Customer> findAllCustomer();
}

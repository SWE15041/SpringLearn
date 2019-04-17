package com.swe.dao.impl;

import com.swe.dao.CustomerDao;
import com.swe.domain.Customer;

import java.util.List;

/**
 * 客户持久层实现类；
 */
public class CustomerDaoImpl implements CustomerDao {

    private QueryRunner runner;
    @Override
    public Customer findCustomerById(Long custId) {
        return null;
    }

    @Override
    public void deleteCutomer(Long custId) {

    }

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public List<Customer> findAllCustomer() {
        return null;
    }
}

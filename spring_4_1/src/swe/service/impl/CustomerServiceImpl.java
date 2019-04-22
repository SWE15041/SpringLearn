package swe.service.impl;

import com.swe.dao.CustomerDao;
import com.swe.domain.Customer;
import com.swe.service.CustomerService;

import java.util.List;

/**
 * 客户业务层实现类
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }

    @Override
    public void saveCustomer(Customer customer) {

        customerDao.saveCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {

        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long custId) {
customerDao.deleteCutomer(custId);
    }

    @Override
    public Customer findCustomerById(Long custId) {
        return customerDao.findCustomerById(custId);
    }
}



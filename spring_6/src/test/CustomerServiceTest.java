package test;

import com.swe.domain.Customer;
import com.swe.service.CustomerService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJunit4ClassRunner.class)
@ContextConfiguration(SpringConfiguration.class)
public class CustomerServiceTest {

    @Autowired
    private  CustomerService cs;
    @Test
    public void findAllCustomer() {
        List<Customer> list = cs.findAllCustomer();
        for (Customer customer : list) {
            System.out.println(customer);
        }

    }

    @Test
    public void saveCustomer() {
        Customer customer = new Customer();
        customer.setCust_name("测试save");
        cs.saveCustomer(customer);
    }

    @Test
    public void updateCustomer() {
        Customer customer = cs.findCustomerById(1L);
        customer.setCust_name("测试修改");
        cs.updateCustomer(customer);
    }


    @Test
    public void deleteCustomer() {
    cs.deleteCustomer(2L);
    }

    @Test
    public void findCustomerById() {
        Customer customer = cs.findCustomerById(3L);
        
    }
}
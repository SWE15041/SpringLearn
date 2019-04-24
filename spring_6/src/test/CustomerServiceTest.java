package test;

import com.swe.domain.Customer;
import com.swe.service.CustomerService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
//@ContextConfiguration(locations = {"classpath:bean.xml"})
public class CustomerServiceTest {

    @Autowired
    private CustomerService cs;

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
        System.out.println(customer);
    }
}
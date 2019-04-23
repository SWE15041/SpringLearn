package test;

import config.SpringConfiguration;
import com.swe.domain.Customer;
import com.swe.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CustomerServiceImplTest {

    @Test
    public void findAllCustomer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CustomerService cs = (CustomerService) ac.getBean("customerService");
        List<Customer> list = cs.findAllCustomer();
        for (Customer customer : list) {
            System.out.println(customer);
        }

    }

    @Test
    public void saveCustomer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CustomerService cs = (CustomerService) ac.getBean("customerService");
        Customer customer = new Customer();
        customer.setCust_name("测试save");
        cs.saveCustomer(customer);
    }

    @Test
    public void updateCustomer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CustomerService cs = (CustomerService) ac.getBean("customerService");
        Customer customer = cs.findCustomerById(1L);
        customer.setCust_name("测试修改");
        cs.updateCustomer(customer);
    }


    @Test
    public void deleteCustomer() {
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CustomerService cs = (CustomerService) ac.getBean("customerService");
    }

    @Test
    public void findCustomerById() {
    }
}
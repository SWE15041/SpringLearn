package com.swe.service.impl;

import com.swe.dao.CustomerDao;
import com.swe.domain.Customer;
import com.swe.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户业务层实现类
 * @author lyn
 *     <bean id="customerService" class="com.swe.service.impl.CustomerServiceImpl"></bean>
 *     1.用于创建bean对象
 *          @Component
 *              作用:就相当于一个bean标签。
 *              它能出现的位置：类上面
 *              属性：value,含义是指定bean的i的，当不写时，它的默认值是 当前类的短名首字母改小写；
 *          由此注解衍生的三个注解：
 *                  @Controller   一般用于表现层的注解
 *                  @Service        一般用于业务层
 *                  @Repository     一般用于持久层
 *                  他们和@Component的作用及属性都是一模一样
 *     2、用于注入数据的
 *                  @Autowired
 *                      作用：自动按照类型注入，只要有唯一 的类型匹配就能注入成功
 *                            如果注入的bean在容器中的类型不唯一时，它会把变量名作为bean的id，在容器中查找，找到后也能注入成功。
 *                            如果没有找到一致的bean的id，则抛异常。
 *                            当使用注解注入的时候，set方法就不是必须的了。
 *                  @Qualifier
 *                      作用：在自动按照类型注入的基础之上,再按照bean的id注入。
 *                            它在给类成员注入数据时，不能独立使用；但是在给方法的形参注入数据的时候，可以独立使用。
 *                      属性：
 *                          value:用于指定bean的id。
 *                  @Resource
 *                      作用：直接按照bean的id注入
 *                      属性：
 *                            name：用于注入bean的id。
 *                  以上三个注解都是用于注入其他bean类型的；用于注入注入基本类型和string类型需要使用@Value
 *                  @Value
 *                      作用：用于注入基本类型和String类型的数据;它可以借助spring的el表达式读取properties文件中的配置。
 *                      属性：
 *                          value:用于指定要注入的数据
 *
 *     3、用于改变作用范围
 *                  @Scope
 *                      作用：用于改变bean的作用范围
 *                      属性：
 *                          value:用于指定范围的取值；
 *                          取值和xml文件中的scope属性的取值是一样的:singleton,prototype,request,session,globalsession
 *
 *     4、和生命周期相关的
 *     5、spring的新注解
 *
 */
@Service("customerService")
//@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

    @Value("测试String类型注入")
    private String name;

//    @Autowired
//    @Qualifier("customerDao2")
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Override
    public void saveCustomer() {
        System.out.println("业务层调用持久层....+name:"+name);
        customerDao.saveCustomer();
    }
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



package com.swe.ui;

import com.swe.service.CustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  spring的依赖注入测试
 */
public class MyClient {
    public static void main(String[] args){
        //负责类型注入测试
        //1.获取ioc容器
        ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        //2.通过bean的id来获取对象 测试Bean的作用范围
        CustomerService customerService3 = ((CustomerService) ac.getBean("customerService3"));
        customerService3.saveCustomer();
        ac.close();
//        System.out.println(customerService3);
    }



//
//    public static void main(String[] args){
//        //set注入方式测试
//        //1.获取ioc容器
//        ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
//        //2.通过bean的id来获取对象 测试Bean的作用范围
//        CustomerService customerService2 = ((CustomerService) ac.getBean("customerService2"));
//        customerService2.saveCustomer();
//        ac.close();
////        System.out.println(customerService2);
//    }

//    public static void main(String[] args){
//        //构造注入测试
//        //1.获取ioc容器
//        ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
//        //2.通过bean的id来获取对象 测试Bean的作用范围
//        CustomerService customerService = ((CustomerService) ac.getBean("customerService"));
//        customerService.saveCustomer();
//        ac.close();
////        System.out.println(customerService);
//    }


//    public static void main(String[] args){
//        //第二种 立即加载
//        //1.获取ioc容器
//        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
//        //2.通过bean的id来获取对象
//        CustomerService customerService = ((CustomerService) ac.getBean("customerService"));
//        System.out.println(customerService);
//
//        CustomerService customerService2 = ((CustomerService) ac.getBean("customerService"));
//        System.out.println(customerService2);
//    }

//    public static void main(String[] args){
//        //第二种 立即加载
//        //1.获取ioc容器
//        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
//        //2.通过bean的id来获取对象
//        CustomerService instanceCustomerService = (CustomerService) ac.getBean("instanceCustomerService");
//        System.out.println(instanceCustomerService);
//    }
//    public static void main(String[] args){
//        //第二种 立即加载
//        //1.获取ioc容器
//        ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
//        //2.通过bean的id来获取对象
//        CustomerService customerService = ((CustomerService) ac.getBean("customerService"));
//        System.out.println(customerService);
//
//        CustomerService staticCustomerService = (CustomerService) ac.getBean("staticCustomerService");
//        System.out.println(staticCustomerService);
//    }

//    public static void main(String[] args) {
//        //第一种 延迟加载
////        ClassPathResource resource = new ClassPathResource("bean.xml");
////        BeanFactory factory=new XmlBeanFactory(resource);
////        CustomerService customerService = ((CustomerService) factory.getBean("customerService"));
//
//        //第二种 立即加载
//        //1.获取ioc容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        //2.通过bean的id来获取对象
//        CustomerService customerService = ((CustomerService) ac.getBean("customerService"));
//        System.out.println(customerService);
//    }


    }

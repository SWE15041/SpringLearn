package com.swe.ui;

import com.swe.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring入门案例
 */
public class MyClient {
    /**
     * 加载配置文件的两种方式：
     * ClassPathXmlApplicationContext:它只能加载类路径的配置文件
     * FileSystemXmlApplicationContext:它可以加载磁盘任意位置的配置文件
     *
     * Bean创建的两种规则：
     * BeanFactory:提供的是一种 延迟加载 思想来创建bean对象，bean什么时候用就什么时候创建
     * ApplicationContext:提供的是一种 立即加载 思想来创建bean对象。只要一解析完配置文件，就立马创建bean对象。
     *
     * Bean创建的三种方式:
     * 第一种方式：调用默认的无参构造函数创建（默认情况下，如果没有默认无参构造函数，则创建失败，会报异常）(常用方式)
     * 第二种方式： 使用静态 工厂中的方法创建对象（需要使用bean标签的factory-method属性，指定静态工厂中创建对象的方法）
     * 第三种方式：使用实例工厂中的方法创建
     *
     * Bean的作用范围：
     *          它可以通过配置的方式来调整作用范围。
     *          配置的属性：bean标签的scope属性。
     *          属性的取值：
     *              singleton: 单例的（默认值）
     *              prototype: 多例的 （当我们让spring接管struts2的action创建时，action必须配置此值）
     *              request: 作用范围是一次请求,和当前请求的转发；
     *              session: 作用范围是一次会话;
     *              globalsession: 作用范围是一次会话；
     *
     * Bean的生命周期：
     *      涉及bean标签的两个属性：
     *                     init-method
     *                     destory-method
     *      单例：
     *           出生：容器创建，对象生成；
     *           活着：只要容器在，对象就一直存在；
     *           死亡：容器销毁，对象消亡；
     *      多例：
     *           出生：每次使用时，创建对象
     *           活着：只用对象在使用中就一直活着
     *           死亡：当对象长时间不使用，并且没有别的对象引用时，由Java的垃圾回收器销毁
     *
     * @param args
     */
    public static void main(String[] args){
         //第二种 立即加载
        //1.获取ioc容器
        ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        //2.通过bean的id来获取对象 测试Bean的作用范围
        CustomerService customerService = ((CustomerService) ac.getBean("customerService"));
        System.out.println(customerService);
        ac.close();
    }


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

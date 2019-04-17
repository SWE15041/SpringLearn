package com.swe.factory;

import java.io.InputStream;
import java.util.*;

/**
 * 一个工厂类
 */
public class BeanFactory {

    public static void main(String[] args) {
        System.out.println(props.get("CUSTOMERDAO"));
    }

    //1 属性对象

    private static Properties props = new Properties();

    //2.1使用静态代码给属性赋值,通过类加载器读取配置文件
    static {
        InputStream in = null;
        try {
            in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
//            FileInputStream in = new FileInputStream("src/bean.properties");
            props.load(in);
        } catch (Exception e) {
            throw new ExceptionInInitializerError("加载配置文件失败：" + e);
        }
    }
//    /**
//     * 根据bean的名称创建类对象
//     * @param beanName
//     * @return
//     */
//    public static Object getBean(String beanName) {
//        try {
//            String beanPath = bundle.getString(beanName);
//            return Class.forName(beanPath).newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//********************************分割线*********************************************
    /**
     * 2.2 通过ResourceBundle读取配置文件
     *
     * 1.只能用于读取properties文件，别的文件不能读取
     * 2.只能用于读取，不能用于写入
     * 3.只读取类路径下的文件
     * 4.方法参数是按照 (包名.类名) 的方式写的,不写文件的拓展名，
     */
    private static ResourceBundle bundle=ResourceBundle.getBundle("bean");

    /**
     * 定义一个容器存放我们要使用的对象
     *
     */
    private static Map<String,Object> beans=new HashMap<>();

    //使用静态代码，初始化map
    static {
        //1.读取配置文件的所有配置：key部分
        Enumeration<String> keys = bundle.getKeys();
        //2遍历keys
        try {
            while (keys.hasMoreElements()) {
                //3.取出key
                String key = keys.nextElement();
                //4.根据key获取beanPath
                String beanPath = bundle.getString(key);
                //5.根据beanPath 反射创建类对象
                Object value = Class.forName(beanPath).newInstance();
                //6.存进map
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("创建容器失败，程序停止执行！");
        }
    }

    /**
     * 根据bean的唯一标识获取对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
//        try {
//            String beanPath = bundle.getString(beanName);
//            return Class.forName(beanPath).newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        return beans.get(beanName);
    }

//********************************分割线*********************************************
//    public static CustomerService getCustomerService() {
//        try {
//            return (CustomerService) Class.forName("com.swe.service.impl.CustomerServiceImpl").newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static CustomerDao getCustomerDao() {
//        try {
//            return (CustomerDao) Class.forName("com.swe.dao.impl.CustomerDaoImpl").newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}

package config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 一个spring的配置类
 * 他的作用相当于bean.xml
 * @author lyn
 */
//把当前类看成spring的配置类
@Configuration
//指定扫描的包
//@ComponentScan({"com.swe","config"})
@ComponentScan("com.swe")
//导入其他配置类
@Import(JdbcConfig.class)
@PropertySource(value = "classpath:/config/jdbcConfig.properties")
public class SpringConfiguration {

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}

package config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 一个spring的配置类
 *
 * @author lyn
 */
//把当前类看成spring的配置类
@Configuration
@ComponentScan("com.swe")
@Import(JdbcConfig.class)
@PropertySource("classpath:config/jdbcConfig.properties")
public class SpringConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}

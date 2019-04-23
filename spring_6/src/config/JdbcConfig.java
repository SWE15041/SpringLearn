package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//@Component
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    /**
     * 把方法的返回值存入到容器中，
     * * 该注解有一个属性，name:用于指定bean的id,当不指定时取默认值，即方法的名称
     * *  命名规则：类名首字母大写，方法名首字母大写
     *
     * @param dataSource
     * @return
     */
    @Bean(name = "runner")
    public QueryRunner createQueryRunner(@Qualifier("dataSource") DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    @Bean(name = "dataSource")
    public DataSource createDataSource() {
        ComboPooledDataSource ds = null;
        try {
            ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("            ds.setJdbcUrl(“jdbc:mysql://localhost:3306/spring_learn?useUnicode=true&characterEncoding=utf8);\n");
            ds.setUser("root");
            ds.setPassword("970131");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ds;
    }


    @Bean(name = "ds2")
    public DataSource createDataSource2() {
        ComboPooledDataSource ds = null;
        try {
            ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("            ds.setJdbcUrl(“jdbc:mysql://localhost:3306/spring_learn?useUnicode=true&characterEncoding=utf8);\n");
            ds.setUser("root");
            ds.setPassword("970131");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ds;
    }
}

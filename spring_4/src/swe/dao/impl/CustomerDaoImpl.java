package swe.dao.impl;

import com.swe.dao.CustomerDao;
import com.swe.domain.Customer;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 客户持久层实现类；
 */
public class CustomerDaoImpl implements CustomerDao {

    private QueryRunner runner=new QueryRunner();


    @Override
    public Customer findCustomerById(Long custId) {
        try {
            return runner.query("select * from cst_customer where cust_id=?", new BeanHandler<Customer>(Customer.class),custId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteCutomer(Long custId) {
        try {
            runner.update("delete * from cst_customer where cust_id = ?", custId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveCustomer(Customer customer) {
        try {
            runner.update("insert into cst_sutomer ( cust_name,cust_source,cust_industry,cust_level,cuts_address,cust_phone)values(?,?,?,?,?,?)",
                    customer.getCust_name(), customer.getCust_source(), customer.getCust_industry(),
                    customer.getCust_level(), customer.getCust_address(), customer.getCust_phone(), customer.getCust_id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        try {
            runner.update("update cst_sutomer set cust_name=?,cust_source=?,cust_industry=?,cust_level=?,cuts_address=?,cust_phone=? where cust_id=?",
                    customer.getCust_name(), customer.getCust_source(), customer.getCust_industry(),
                    customer.getCust_level(), customer.getCust_address(), customer.getCust_phone(), customer.getCust_id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 查询所有客户
     *
     * @return
     */
    @Override
    public List<Customer> findAllCustomer() {
        try {
            return runner.query("select * from cst_customer", new BeanListHandler<Customer>(Customer.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

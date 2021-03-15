package com.hexaware.MLP312.persistence;

import java.util.List;

import com.hexaware.MLP312.model.Customer;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
/**
 * CustomerDAO class used to fetch data from data base.
 * @author hexware
 */
public interface CustomerDAO {
    /**
     * @return the all the Customer record.
     */
  @SqlQuery("Select * from Customer")
    @Mapper( CustomerMapper.class)
    List <Customer> show();
    /**
     * @return the all the Customer record.
     */
  @SqlQuery("Select * from Customer where CUS_ID = :cid")
  @Mapper (CustomerMapper.class)
 Customer selectCustomer(@Bind("cid") int cid);

 @SqlUpdate("insert into Customer values (:cid)")
 int insertCustomer(@Bind("cid") int cid);
 @SqlUpdate("update customer set cust_id = :ucid where cust_id = :pcid")
 int updateCustomer(@Bind("ucid") int cusid,@Bind("pcid") int custid);
}

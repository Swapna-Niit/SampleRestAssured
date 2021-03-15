package com.hexaware.MLP312.factory;

import com.hexaware.MLP312.persistence.CustomerDAO;
import com.hexaware.MLP312.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP312.model.Customer;
/**
 * CustomerFactory class used to fetch Customer data from database.
 * @author hexware
 */
public class CustomerFactory {
  /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of Customer object.
   */
  public static Customer[] showCustomer() {
    List<Customer> Customer = dao().show();
    return Customer.toArray(new Customer[Customer.size()]);
  }
    /**
   * Call the data base connection.
   * @return the an Customer object.
   */
  public static Customer selectCustomer(int cid) {
    Customer Customer = dao().selectCustomer(cid);
      return Customer;
  }

  public static int insertCustomer(int cid) {
      return dao().insertCustomer(cid);
  }
public static int updateCustomer(int ucusid, int pcusid) {
    return dao().updateCustomer(ucusid,pcusid);
}
}


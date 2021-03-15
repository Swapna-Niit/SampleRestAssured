package com.hexaware.MLP312.model;
//import java.util.Objects;
import java.util.Date;
import java.util.Objects;

/**
 * Customer class used to display Customer information.
 * @author hexware
 */
public class Customer {
/**
 * cusId to store cusId.
 */
  private int cusId;
/**
 * cusName to store cusName.
 */

  public Customer() {

  }
    
    /**
     * @return this cus ID.
     */
  public final int getCusId() {
    return cusId;
  }
    /**
     * @param argCusId gets the cus id.
     */
  public final void setCusId(final int argCusId) {
    this.cusId = argCusId;
  }

  public Customer(int cusId) {
    this.cusId = cusId;
  }

  public Customer cusId(int cusId) {
    setCusId(cusId);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return cusId == customer.cusId;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(cusId);
  }

  @Override
  public String toString() {
    return "{" +
      " cusId='" + getCusId() + "'" +
      "}";
  }


 
}

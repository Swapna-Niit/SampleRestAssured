package com.hexaware.MLP312.util;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP312.model.Customer;
import com.hexaware.MLP312.factory.CustomerFactory;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/customer")
public class CustomerRest {
  /**
   * Returns Customer details.
   * @return the Customer details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Customer[] listCustomer() {
    final Customer[] Customer = CustomerFactory.showCustomer();
    return Customer;
  }
    /**
   * Returns Customer details.
   * @return the Customer details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/CustomerDetails/{fid}")
  public final Customer selectCustomer(@PathParam("fid") int fid) {
    final Customer Customer = CustomerFactory.selectCustomer(fid);
    return Customer;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/registernewcustomer")
  public final int insertCustomer(final Customer customer) {
    final int result = CustomerFactory.insertCustomer(customer.getCusId());
    return result;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/updatecustomer/{ucusid}/{pcusid}")
  public final int updateCustomer(@PathParam("ucusid") final int ucusid,@PathParam("pcusid") final int pcusid) {
    final int result = CustomerFactory.updateCustomer(ucusid,pcusid);
    return result;
  }

}

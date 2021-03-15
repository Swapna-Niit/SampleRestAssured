package com.hexaware.MLP312.factory;

//import com.hexaware.MLP312.persistence.MenuDAO;
import com.hexaware.MLP312.persistence.VendorDAO;
import com.hexaware.MLP312.persistence.DbConnection;
import java.util.List;

//import com.hexaware.MLP312.model.Menu;
import com.hexaware.MLP312.model.Vendor;
/**
 * VendorFactory class used to fetch Vendor data from database.
 * @author hexware
 */
public class VendorFactory {
    /**
     * Protected constructor.
     */
    protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static VendorDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of vendor object.
   */
  public static Vendor[] showVendor() {
    List<Vendor> vendor = dao().show();
    return vendor.toArray(new Vendor[vendor.size()]);
  }
}


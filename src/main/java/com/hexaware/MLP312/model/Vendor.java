package com.hexaware.MLP312.model;
import java.util.Objects;

/**
 * Vendor class used to display vendor information.
 * @author hexware
 */
public class Vendor {

/**
 * vendorId to store vendorId.
 */
  private int vendorId;
/**
 * vendorName to store vendorName.
 */
  private String vendorName;
/**
 * vendorPhno to store vendorPhno.
 */
  private String vendorPhno;
/**
 * vendorEmail to store vendorEmail.
 */
  private String vendorEmail;
/**
 * vendorWalletId to store vendorWalletId.
 */
  private int vendorWalletId;
  /**
   * Default Constructor.
   */
  public Vendor() {

  }
/**
 * @param argVendorId to initialize vendor id.
 * used to get details through constructor.
 */
  public Vendor(final int argVendorId) {
    this.vendorId = argVendorId;
  }
  @Override
  public final boolean equals(final Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Vendor)) {
      return false;
    }
    Vendor vendor = (Vendor) o;
    return vendorId == vendor.vendorId && Objects.equals(vendorName, vendor.vendorName)
      && Objects.equals(vendorPhno, vendor.vendorPhno)
      && Objects.equals(vendorEmail, vendor.vendorEmail)
      && vendorWalletId == vendor.vendorWalletId;
  }
  @Override
  public final int hashCode() {
    return Objects.hash(vendorId, vendorName, vendorPhno, vendorEmail, vendorWalletId);
  }
    /**
     * @return this vendor ID.
     */

  public final int getVendorId() {
    return this.vendorId;
  }
    /**
     * @param argVendorId gets the food id.
     */
  public final void setVendorId(final int argVendorId) {
    this.vendorId = argVendorId;
  }
    /**
     * @return this vendor Name.
     */
  public final String getVendorName() {
    return this.vendorName;
  }
    /**
     * @param argVendorName gets the vendor Name.
     */
  public final void setVendorName(final String argVendorName) {
    this.vendorName = argVendorName;
  }
    /**
     * @return this vendor Phno.
     */
  public final String getVendorPhno() {
    return this.vendorPhno;
  }
    /**
     * @param argVendorPhno gets the vendor Phno.
     */
  public final void setVendorPhno(final String argVendorPhno) {
    this.vendorPhno = argVendorPhno;
  }
    /**
     * @return this vendor email.
     */
  public final String getVendorEmail() {
    return this.vendorEmail;
  }
    /**
     * @param argVendorEmail gets the vendor email.
     */
  public final void setVendorEmail(final String argVendorEmail) {
    this.vendorEmail = argVendorEmail;
  }
    /**
     * @return this vendor walletId.
     */
  public final  int getVendorWalletId() {
    return this.vendorWalletId;
  }
    /**
     * @param argVendorWalletId gets the vendor walletId.
     */
  public final void setVendorWalletId(final int argVendorWalletId) {
    this.vendorWalletId = argVendorWalletId;
  }
}

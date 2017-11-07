package net.swindle.springdemo.domain;

import net.swindle.springdemo.service.BusinessService;

/**
 * Organizations.
 *
 * @author swindle
 */
public class Organization {

  private final String companyName;
  private String slogan;
  private BusinessService businessService;

  /**
   * Constructor
   *
   * @param companyName
   */
  public Organization(String companyName) {
    this.companyName = companyName;
  }

  /** @return companyName */
  public String getCompanyName() {
    return companyName;
  }

  /** @param postalCode */
  public void setPostalCode(String postalCode) {}

  /** @param employeeCount */
  public void setEmployeeCount(int employeeCount) {}

  /** @param slogan */
  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }

  /** @param businessService */
  public void setBusinessService(BusinessService businessService) {
    this.businessService = businessService;
  }

  /** @return */
  public String corporateSlogan() {
    return slogan;
  }

  /** @return */
  public String corporateService() {
    return businessService.offerService(companyName);
  }
}

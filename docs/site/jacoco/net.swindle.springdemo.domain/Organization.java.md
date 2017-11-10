[Sessions](../jacoco-sessions.md)[maven-code-quality-pom](../index.md)
\> [net.swindle.springdemo.domain](index.source.md) \>
Organization.java

# Organization.java

``` source lang-java  
package net.swindle.springdemo.domain;

import net.swindle.springdemo.service.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;

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
   * Constructor method.
   *
   * @param companyName The company name
   */
  public Organization(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Access company name.
   *
   * @return companyName The company name
   */
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Provide for Spring Bean mutation.
   *
   * @param postalCode The postal/regional code.
   */
  @Autowired(required = false)
  public void setPostalCode(String postalCode) {}

  /**
   * Provide for Spring Bean mutation.
   *
   * @param employeeCount The number of people employeed in the company.
   */
  @Autowired(required = false)
  public void setEmployeeCount(int employeeCount) {}

  /**
   * Modify the company slogan.
   *
   * @param slogan The company's slogan.
   */
  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }

  /**
   * Provide for Spring Bean mutation.
   *
   * @param businessService Reference to outsourced service-provider.
   */
  public void setBusinessService(BusinessService businessService) {
    this.businessService = businessService;
  }

  /**
   * Announce the company's slogan.
   *
   * @return The company slogan.
   */
  public String corporateSlogan() {
    return slogan;
  }

  /**
   * Announce services provided.
   *
   * @return Statement of services offered
   */
  public String corporateService() {
    return businessService.offerService(companyName);
  }
}
```

Created with [JaCoCo](http://www.jacoco.org/jacoco) 0.7.9.201702052155

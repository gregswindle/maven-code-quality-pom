[View
Javadoc](../../../../../apidocs/net/swindle/springdemo/domain/Organization.md)

    1   package net.swindle.springdemo.domain;
    2   
    3   import net.swindle.springdemo.service.BusinessService;
    4   
    5   import org.springframework.beans.factory.annotation.Autowired;
    6   
    7   /**
    8    * Organizations.
    9    *
    10   * @author swindle
    11   */
    12  public class Organization {
    13  
    14    private final String companyName;
    15    private String slogan;
    16    private BusinessService businessService;
    17  
    18    /**
    19     * Constructor method.
    20     *
    21     * @param companyName The company name
    22     */
    23    public Organization(String companyName) {
    24      this.companyName = companyName;
    25    }
    26  
    27    /**
    28     * Access company name.
    29     *
    30     * @return companyName The company name
    31     */
    32    public String getCompanyName() {
    33      return companyName;
    34    }
    35  
    36    /**
    37     * Provide for Spring Bean mutation.
    38     *
    39     * @param postalCode The postal/regional code.
    40     */
    41    @Autowired(required = false)
    42    public void setPostalCode(String postalCode) {}
    43  
    44    /**
    45     * Provide for Spring Bean mutation.
    46     *
    47     * @param employeeCount The number of people employeed in the company.
    48     */
    49    @Autowired(required = false)
    50    public void setEmployeeCount(int employeeCount) {}
    51  
    52    /**
    53     * Modify the company slogan.
    54     *
    55     * @param slogan The company's slogan.
    56     */
    57    public void setSlogan(String slogan) {
    58      this.slogan = slogan;
    59    }
    60  
    61    /**
    62     * Provide for Spring Bean mutation.
    63     *
    64     * @param businessService Reference to outsourced service-provider.
    65     */
    66    public void setBusinessService(BusinessService businessService) {
    67      this.businessService = businessService;
    68    }
    69  
    70    /**
    71     * Announce the company's slogan.
    72     *
    73     * @return The company slogan.
    74     */
    75    public String corporateSlogan() {
    76      return slogan;
    77    }
    78  
    79    /**
    80     * Announce services provided.
    81     *
    82     * @return Statement of services offered
    83     */
    84    public String corporateService() {
    85      return businessService.offerService(companyName);
    86    }
    87  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.

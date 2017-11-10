[View
Javadoc](../../../../../apidocs/net/swindle/springdemo/serviceimpl/AgencyRecruitmentServiceImpl.md)

    1   package net.swindle.springdemo.serviceimpl;
    2   
    3   import java.util.Random;
    4   
    5   import net.swindle.springdemo.service.RecruitmentService;
    6   
    7   /**
    8    * Agency recruitment service.
    9    *
    10   * @author swindle
    11   */
    12  public class AgencyRecruitmentServiceImpl implements RecruitmentService {
    13  
    14    /* (non-Javadoc)
    15     * @see net.swindle.springdemo.service.RecruitmentService#recruitEmployees(java.lang.String,
    16     * java.lang.String, int)
    17     */
    18    @Override
    19    public String recruitEmployees(
    20        String companyName, String departmentName, int numberOfRecruitments) {
    21      final Random random = new Random();
    22      return "\n"
    23          + companyName
    24          + "'s "
    25          + departmentName
    26          + " hired "
    27          + random.nextInt(numberOfRecruitments)
    28          + " employees "
    29          + "using various hiring agencies.";
    30    }
    31  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.

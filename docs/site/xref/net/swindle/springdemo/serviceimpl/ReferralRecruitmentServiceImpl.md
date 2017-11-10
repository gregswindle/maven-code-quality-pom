[View
Javadoc](../../../../../apidocs/net/swindle/springdemo/serviceimpl/ReferralRecruitmentServiceImpl.md)

    1   package net.swindle.springdemo.serviceimpl;
    2   
    3   import java.util.Random;
    4   
    5   import net.swindle.springdemo.service.RecruitmentService;
    6   
    7   public class ReferralRecruitmentServiceImpl implements RecruitmentService {
    8   
    9     /* (non-Javadoc)
    10     * @see net.swindle.springdemo.service.RecruitmentService#recruitEmployees(java.lang.String,
    11     * java.lang.String, int)
    12     */
    13    @Override
    14    public String recruitEmployees(
    15        String companyName, String departmentName, int numberOfRecruitments) {
    16      final Random random = new Random();
    17      return "\n"
    18          + companyName
    19          + "'s "
    20          + departmentName
    21          + " hired  "
    22          + random.nextInt(numberOfRecruitments)
    23          + " employees "
    24          + " which were referred to the company by employees.";
    25    }
    26  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.

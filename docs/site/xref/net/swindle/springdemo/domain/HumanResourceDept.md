[View
Javadoc](../../../../../apidocs/net/swindle/springdemo/domain/HumanResourceDept.md)

    1   package net.swindle.springdemo.domain;
    2   
    3   import net.swindle.springdemo.service.RecruitmentService;
    4   
    5   /**
    6    * Implementation of Department
    7    *
    8    * @author swindle
    9    */
    10  public class HumanResourceDept implements Department {
    11  
    12    private String deptName;
    13    private final RecruitmentService recruitmentService;
    14    private final Organization organization;
    15  
    16    /**
    17     * @param recruitmentService A company that links potential employees to businesses for hire.
    18     * @param organization
    19     */
    20    public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
    21      this.recruitmentService = recruitmentService;
    22      this.organization = organization;
    23    }
    24  
    25    /** @param deptName */
    26    public void setDeptName(String deptName) {
    27      this.deptName = deptName;
    28    }
    29  
    30    /* (non-Javadoc)
    31     * @see net.swindle.springdemo.domain.Department#hiringStatus(int)
    32     */
    33    @Override
    34    public String hiringStatus(int numberOfRecruitments) {
    35      return recruitmentService.recruitEmployees(
    36          organization.getCompanyName(), deptName, numberOfRecruitments);
    37    }
    38  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.

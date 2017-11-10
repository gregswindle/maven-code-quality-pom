[View
Javadoc](../../../../../apidocs/net/swindle/springdemo/service/RecruitmentService.md)

    1   package net.swindle.springdemo.service;
    2   
    3   /**
    4    * A company that links potential employees to businesses for hire.
    5    *
    6    * @author swindle
    7    */
    8   @SuppressWarnings("PMD")
    9   public interface RecruitmentService {
    10    /**
    11     * @param companyName The name of the company
    12     * @param departmentName The targeted department
    13     * @param numberOfRecruitments The number of successful job finds
    14     * @return
    15     */
    16    public String recruitEmployees(
    17        String companyName, String departmentName, int numberOfRecruitments);
    18  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.

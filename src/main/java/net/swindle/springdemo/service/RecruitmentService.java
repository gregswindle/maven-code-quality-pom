package net.swindle.springdemo.service;

/**
 * A company that links potential employees to businesses for hire.
 *
 * @author swindle
 */
@SuppressWarnings("PMD")
public interface RecruitmentService {
  /**
   * @param companyName The name of the company
   * @param departmentName The targeted department
   * @param numberOfRecruitments The number of successful job finds
   * @return
   */
  public String recruitEmployees(
      String companyName, String departmentName, int numberOfRecruitments);
}

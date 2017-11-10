package net.swindle.springdemo.domain;

import net.swindle.springdemo.service.RecruitmentService;

/**
 * Implementation of Department
 *
 * @author swindle
 */
public class HumanResourceDept implements Department {

  private String deptName;
  private final RecruitmentService recruitmentService;
  private final Organization organization;

  /**
   * @param recruitmentService A company that links potential employees to businesses for hire.
   * @param organization
   */
  public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
    this.recruitmentService = recruitmentService;
    this.organization = organization;
  }

  /** @param deptName */
  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  /* (non-Javadoc)
   * @see net.swindle.springdemo.domain.Department#hiringStatus(int)
   */
  @Override
  public String hiringStatus(int numberOfRecruitments) {
    return recruitmentService.recruitEmployees(
        organization.getCompanyName(), deptName, numberOfRecruitments);
  }
}

package net.swindle.springdemo.service;

@SuppressWarnings("PMD")
public interface RecruitmentService {
  public String recruitEmployees(
      String companyName, String departmentName, int numberOfRecruitments);
}

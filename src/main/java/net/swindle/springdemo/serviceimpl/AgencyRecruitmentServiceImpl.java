package net.swindle.springdemo.serviceimpl;

import java.util.Random;

import net.swindle.springdemo.service.RecruitmentService;

/**
 * Agency recruitment service.
 *
 * @author swindle
 */
public class AgencyRecruitmentServiceImpl implements RecruitmentService {

  @Override
  public String recruitEmployees(
      String companyName, String departmentName, int numberOfRecruitments) {
    final Random random = new Random();
    final String hiringFacts =
        "\n"
            + companyName
            + "'s "
            + departmentName
            + " hired "
            + random.nextInt(numberOfRecruitments)
            + " employees "
            + "using various hiring agencies.";
    return hiringFacts;
  }
}

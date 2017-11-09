package net.swindle.springdemo.domain;

@SuppressWarnings("PMD")
public interface Department {
  /**
   * @param numberOfRecruitments
   * @return
   */
  public String hiringStatus(int numberOfRecruitments);
}

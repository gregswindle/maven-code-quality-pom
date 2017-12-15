package net.swindle.springdemo.serviceimpl;

import java.util.Random;
import net.swindle.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

  /* (non-Javadoc)
   * @see net.swindle.springdemo.service.BusinessService#offerService(java.lang.String)
   */
  @Override
  public String offerService(String companyName) {
    final Random random = new Random();
    return "\nAs an Organization, "
        + companyName
        + " offers world class Cloud computing infrastructure."
        + "\nThe annual income exceeds "
        + random.nextInt(revenue)
        + " dollars.";
  }
}

package net.swindle.springdemo.serviceimpl;

import java.util.Random;
import net.swindle.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

  /* (non-Javadoc)
   * @see net.swindle.springdemo.service.BusinessService#offerService(java.lang.String)
   */
  @Override
  public String offerService(String companyName) {
    final Random random = new Random();
    return "\nAs an Organization, "
        + companyName
        + " provides an outstanding Ecommerce platform."
        + "\nThe annual revenue exceeds "
        + random.nextInt(revenue)
        + " dollars.";
  }
}

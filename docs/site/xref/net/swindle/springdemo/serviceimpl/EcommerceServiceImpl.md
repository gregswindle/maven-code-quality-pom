[View
Javadoc](../../../../../apidocs/net/swindle/springdemo/serviceimpl/EcommerceServiceImpl.md)

    1   package net.swindle.springdemo.serviceimpl;
    2   
    3   import java.util.Random;
    4   
    5   import net.swindle.springdemo.service.BusinessService;
    6   
    7   public class EcommerceServiceImpl implements BusinessService {
    8   
    9     /* (non-Javadoc)
    10     * @see net.swindle.springdemo.service.BusinessService#offerService(java.lang.String)
    11     */
    12    @Override
    13    public String offerService(String companyName) {
    14      final Random random = new Random();
    15      return "\nAs an Organization, "
    16          + companyName
    17          + " provides an outstanding Ecommerce platform."
    18          + "\nThe annual revenue exceeds "
    19          + random.nextInt(revenue)
    20          + " dollars.";
    21    }
    22  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.

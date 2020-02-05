package com.tek.trp.DigiBankTesting.customer;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "classpath:com/tek/trp/DigiBankTesting/customer/updateCustomer.feature")
public class CustomerTest {
}

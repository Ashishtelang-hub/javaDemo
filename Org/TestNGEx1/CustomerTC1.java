package Org.TestNGEx1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CustomerTC1 {
  @Test
  public void createCustomer() {
	  System.out.println("Create Customer");
  }
  @Test
  public void updateCustomer() {
	  System.out.println("Update Customer");
  }
  @Test
  public void deleteCustomer() {
	  System.out.println("Delete Customer");
  }
  @BeforeClass
  public void initCustomerTestData() {
	  System.out.println("Read Test Customer Data");
  }

  @AfterClass
  public void clearCustomerTestData() {
	  System.out.println("Clear Test Customer Data");
  }

}

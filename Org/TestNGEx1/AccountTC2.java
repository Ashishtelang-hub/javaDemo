package Org.TestNGEx1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountTC2 {
  
  @BeforeClass
  public void initAccountData() {
	  System.out.println("Read Account Data");
  }

  @AfterClass
  public void clearAccountData() {
	  System.out.println("Clear Account Data");
  }
  @BeforeTest
  public void getQAEnvironmentDetails() {
	  System.out.println("Read QA Environment Details");  
  }
  @AfterTest
  public void clearQAEnvironmentDetails() {
	  System.out.println("Clear QA Environment Details");
  }
  @Test
  public void createAccount() {
	  System.out.println("Create Account");
  }
  @Test
  public void updateAccount() {
	  System.out.println("Update Account");
  }
  @Test
  public void deleteAccount() {
	  System.out.println("Delete Account");
  }

}

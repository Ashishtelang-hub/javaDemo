package Org.TestNGEx1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AccountTC1 {
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
  @BeforeClass
  public void initAccountData() {
	  System.out.println("Read Account Data");
  }

  @AfterClass
  public void clearAccountData() {
	  System.out.println("Clear Account Data");
  }

}

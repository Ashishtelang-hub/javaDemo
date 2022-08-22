package Org.TestNG;

import org.testng.annotations.Test;

public class PriorityEx2 {
	 @Test (priority = 11)
	  public void login() {
		  System.out.println("Login");
	  }
	  @Test (priority = 80)
	  public void logout() {
		  System.out.println("Logout");
	  }
	 @Test  (priority = 4)
	  public void creatCustomer() {
		  System.out.println("smaller create Customer: Lower case");
	  }
	 @Test  (priority = 5)
	 public void CreateCustomer() {
		 System.out.println("Capital Create Customer");
	 }
	 @Test  (priority = 5)
	 public void updateCustomer() {
		 System.out.println("small update Customer");
	 }
	 @Test  (priority = 6)
	 public void UpdateCustomer() {
		 System.out.println("Capital Update Coustomer");
	 }
	 @Test  (priority = 7)
	 public void deleteCustomer() {
		 System.out.println("smaller delete Customer");
	 }
	 @Test  (priority = 7)
	 public void DeleteCustomer() {
		 System.out.println("Capital Delete Customer");
	 }
}

package Org.TestNG;

import org.testng.annotations.Test;

public class ExecutionSequenceEx1 {
  @Test
  public void login() {
	  System.out.println("Login");
  }
  @Test
  public void logout() {
	  System.out.println("Logout");
  }
 @Test
  public void creatCustomer() {
	  System.out.println("smaller create Customer: Lower case");
  }
 @Test
 public void CreateCustomer() {
	 System.out.println("Capital Create Customer");
 }
 @Test
 public void updateCustomer() {
	 System.out.println("small update Customer");
 }
 @Test
 public void UpdateCustomer() {
	 System.out.println("Capital Update Coustomer");
 }
 @Test
 public void deleteCustomer() {
	 System.out.println("smaller delete Customer");
 }
 @Test
 public void DeleteCustomer() {
	 System.out.println("Capital Delete Customer");
 }
}

package Org.TestNG;

import org.testng.annotations.Test;

public class Ex2 {
  @Test
  public void test1() {
	  System.out.println("Test1");
	  test2();
	  System.out.println("Test1 is End");
  }
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  @Test
  public void test3() {
	  System.out.println("Test3");
	  
  }
}

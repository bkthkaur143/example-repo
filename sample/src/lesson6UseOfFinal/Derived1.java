package lesson6UseOfFinal;

public class Derived1 extends Base1
{
	//legal override as methodx is non final method
	public void methodX() {
		System.out.println("method x in derived class");	
	}
	/* following override is invalid as this method
	 * declared as final in base1 class*/
//	  public void methodY()
//	  {
//		  System.out.println("method y in derived class");
//	  }
	  
	  /*
	   * following declaration is invalid as we can not decrease 
	   * access while overridding 
	   * void methodX(){
	   * }
	   */

}

package lesson6UseOfFinal;

public class Base1 
{
	final int var_final=4;
	/*
	 * constructor cna be final hence
	 * it is illegel to write final public Base()
	 */
	public Base1() 
	{
		System.out.println("default constructor in Base1");
	}
	
	public void methodX() {
		System.out.println("this is method x in base1");
	}
	public final void methodY() {
		
		System.out.println("this is method y in base1");
	}

}

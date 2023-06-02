package lesson6Diffpackage;

class Book
{
	Book()
	{
		System.out.println("I am in constructor");
	}
	void x() 
	{
		System.out.println(" U R IN METHOD X ");
	}
	public void finalize()
	{
		System.out.println(" In finalize method ");
		
	}
}

public class TerminationCondition 
{

	public static void main(String[] args)
	{
		Book nov = new Book();
		//proper cleanup
		nov.x();
		// Drop the reference, forget to clean up:
		new Book();
		// Force garbage collection & finalization
		System.gc();
		System.runFinalization();
		

	}

}

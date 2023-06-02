package sample;
class Abc
{
	public Abc()
	{
		System.out.println("in Abc");
		
	}
	public Abc(int i)
	{
		System.out.println("in Abc parameter constructor");
	}
}

class Bca extends Abc
{
	
	public Bca()
	{
		super();
		System.out.println("in Abc");
		
	}
	public Bca(int i)
	{
		super(i);
		System.out.println("in Abc parameter constructor");
	}
}

public class SuperDemo 
{


	public static void main(String[] args) 
	{
		Bca obj=new Bca(4);

	}

}

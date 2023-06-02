package sample;

interface Demo
{
	void abc();
	default void show() 
	{
		System.out.println("in a default method");
	}
}
class ImpDemo implements Demo
{
	public void abc() 
	{
		System.out.println("in a class abc");
	}
}

public class DefaultMethodInterface 
{

	public static void main(String[] args) 
	{
		ImpDemo obj=new ImpDemo();
		obj.abc(); 
		obj.show();
	}

}

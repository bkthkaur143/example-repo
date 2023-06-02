package sample;

interface Multiple
{
	void abc();
	default void show() 
	{
		System.out.println("in the Multiple ");
	}
}
interface Multipal
{
	
	default void show() 
	{
		System.out.println("in the Multipal ");
	}
}
class ImpMulti implements Multiple , Multipal
{
	public void abc()
	{
		System.out.println("in the abc ");
	}

	@Override
	public void show() {
		
		Multipal.super.show();
	}

}
public class MultipleInheritance 
{

	public static void main(String[] args) 
	{
		ImpMulti obj = new ImpMulti();
		obj.abc();
		obj.show();

	}

}

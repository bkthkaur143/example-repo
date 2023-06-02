package sample;

interface StaticDemo1
{
	int num=8;
	void toy();
	static void show() 
	{
		System.out.println("In a static method");
	}
}
class ImpStatic implements StaticDemo1
{
 public	void toy()
	{
		System.out.println("num = "+(num*num));
	}
 
}

public class StaticMethodInetrface 
{

	public static void main(String[] args) 
	{
		ImpStatic obj=new ImpStatic();
		obj.toy();
		StaticDemo1.show();
		

	}

}

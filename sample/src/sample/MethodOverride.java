package sample;
//
//class A
//{
//	public void show() 
//	{
//		System.out.println("in A class");
//	}
//}
//class B extends A
//{
//	@Override
//	public void show() 
//	{
//		super.show();
//		System.out.println("in B class");
//	}
//}
//public class MethodOverride
//{
//
//	public static void main(String[] args)
//	{
//		B obj=new B();
//		obj.show();
//
//	}
//
//}



class A
{
	public void show() 
	{
		System.out.println("in A class");
	}
}
class B extends A
{
	
	public void show() 
	{
		super.show();
		
		System.out.println("in B class");
	}
	public void config()
	{
		System.out.println("config");
	}
}
class C extends A
{
	public void show() 
	{
		System.out.println("in C class");
	}
}
public class MethodOverride
{

	public static void main(String[] args)
	{
		A obj=new B();
		obj.show();
//		obj.config();
		obj=new C();
		obj.show();

	}

}



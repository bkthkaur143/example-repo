package sample;

class Added//super ,parent
{
	public int add( int i ,int j)
	{
		return i+j;
	}
}
class Subtrac extends Added//sub , child 
{
	public int sub(int x ,int y)
	{
		return x-y;
	}
}
class Multiply extends Subtrac
{
	public int mul(int i,int j) 
	{
		return i*j;
	}
}
class Devide extends Multiply
{
	public int dev(int i,int j)
	{
		return i/j;
	}
}

public class InheritenceDemo //inheritence fetching(inbuilt feature) details own super class 
{

	public static void main(String[] args)
	{
		Devide obj=new Devide();
//        Multiply obj = new Multiply();
        int r1=obj.add(7, 9);
        int r2=obj.sub(9,6);
        int r3=obj.mul(8,7);
        int r4=obj.dev(4,2);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
	}

}

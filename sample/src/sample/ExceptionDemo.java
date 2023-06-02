package sample;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		try 
		{
			int a[] = null;//new int[5];
     		a[4]=5;
			
			System.out.println("Array is ");
			int i=5;
			int j=2;
			int k=i/j;
			System.out.println("k is "+k);
			
			
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("we can not devide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(" array limit is outofbounds ");
			
		}
		catch(Exception e) 
		{
			System.out.println("somthing wrong");
			
		}
		finally 
		{
			System.out.println("Hello");
			
		}
		
		

	}

}

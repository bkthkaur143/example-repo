package zjavapractice;

public class SwapTwonum 
{
	static void swapValue(int m, int n) {
		int temp = m;
		m=n;
		n=temp;
		System.out.println("m value is "+m+" n value is "+n);
	}
	
	static void swapValuewithoutUsingThirdVariable(int x, int y)
	{
		x=x-y;
		y=x+y;
		x=y-x;
		System.out.println("x value is "+x+" y value is "+y);
		
	}
	
	public static void main(String [] args) 
	{
		int m =10,n=8;
		swapValue(m,n);
		
		
		int x=5 , y=7;
		swapValuewithoutUsingThirdVariable(x,y);
		
	}

}

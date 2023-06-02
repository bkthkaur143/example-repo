package zjavapractice;

public class HCFTwoNum 
{
	static int GCD(int x, int y) 
	{
		if(x==0)
			return y;
		if(y==0)
			return x;
		if(x == y)
			return x;
		if(x>y)
			return GCD(x-y,y);
		return GCD(x,y-x);
		
	}

	public static void main(String[] args) 
	{
		int x = 15;
		int y = 5;
		System.out.println("gcd is "+x+ " and "+y+" :"+GCD(x,y));
		

	}

}

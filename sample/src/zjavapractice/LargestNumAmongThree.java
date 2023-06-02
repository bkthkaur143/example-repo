package zjavapractice;

public class LargestNumAmongThree 
{
	static int largest_Num(int x, int y , int z) 
	{
		return z>(x>y ? x:y) ? z:((x>y) ? x:y);
		
	}

	public static void main(String[] args) 
	{
		int a = 6;
		int b = 10;
		int c = 8;
		
		int largest= largest_Num(a,b,c);
		
		System.out.println("larget number is "+ largest);
		

	}

}

package zjavapractice;

public class LcmOfTwoNum 
{
	static int GCD(int u, int v) 
	{
		if(u==0)
			return v;
		return GCD(v % u, u);
		
	}
	static int LCM(int u, int v) {
		return (u / GCD(u,v)*v);
	}
	

	public static void main(String[] args) 
	{
		int u = 15;
		int v = 25;
		System.out.println(LCM(u,v));
		

	}

}

package zjavapractice;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) 
	{
		
		System.out.println(isprime());

	}
	
	public static boolean isprime()
	{
		int n; 
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n==0||n==1)
			return false;
		if(n==2)
			return true;
		for(int i =2; i<=n/2; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}

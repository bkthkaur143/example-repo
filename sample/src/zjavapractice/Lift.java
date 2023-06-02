package zjavapractice;

import java.util.Scanner;

public class Lift {

	public static int main(String[] args)
	{
		
		
		int test, call, a=0, b=7;
		int p, q;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter test cases");
		test = sc.nextInt();
		for(int i = 0; i<test; i++)
		{
			call= sc.nextInt();
			p=a-call;
			q=b-call;
			if(p<q)
			{
				System.out.println("A");
				a=call;
				
			}else
			{
				System.out.println("B");
				b=call; 
			}
			
		}
		return 0;

	}

}

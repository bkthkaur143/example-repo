package zjavapractice;

import java.util.Scanner;

public class Memorise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of input");
		int n = sc.nextInt();
		
		System.out.println("enter input of "+n+" numbers");
		
		int N[] = new int[n];
		for(int i =0; i<n; i++)
		{
			N[i] = sc.nextInt();
		}
		
		System.out.println("enter no. of test cases");
		int test = sc.nextInt();
		for(int j=0; j<test; j++)
		{
			int num = sc.nextInt();
			int count=0;
			
			for(int i = 0; i<n; i++)
			{
				if(num==N[i])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(count);
			}
			else {
				System.out.println("NOT PRESENT");
			}
			
		}

	}

}

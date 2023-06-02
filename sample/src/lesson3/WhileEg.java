package lesson3;

import java.util.Scanner;

public class WhileEg {

	public static void main(String[] args) 
	{
		int i=0;
		while(i<=5) {
			if(i==3)
				break;
			System.out.println(i);
			i++;
		}
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("enter ypur choice");
			int n;
			n=sc.nextInt();
			while(n>5) 
			{
				System.out.println("n = "+n);
				n=n/2;
					
			}
		}
		

	}

}

package zjavapractice;

import java.util.Scanner;

public class Practices {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String s = "";
		char c[] = str.toCharArray();
		
		for(int i = c.length-1; i>=0;i--)
		{
			
			s+=c[i];
		}
		
		System.out.println(s);
				
	}

}

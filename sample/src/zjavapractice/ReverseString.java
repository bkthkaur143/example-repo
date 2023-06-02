package zjavapractice;

import java.util.Scanner;

public class ReverseString
{
	Scanner st = new Scanner(System.in);
	
	
	void reverse()//reverse a string 
	{
		System.out.println("enter a string.....");
		String s="";
		String str = st.nextLine();
		char chars[] = str.toCharArray();
		for(int i = str.length()-1; i>=0; i--)
		{
		s +=	(chars[i]);
			
			
		}
		
		
		System.out.println(s);
		
		
		
		
	}
	void swapnum()
	{
		System.out.println("enter a num A :");
		int a = st.nextInt();
		System.out.println("enter a num B :");
		int b = st.nextInt();
		
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println("after swaping of numbers");
		System.out.println("num A :"+a);
		System.out.println("num B :"+b);
	}

	public static void main(String[] args) 
	{
		
		ReverseString b = new ReverseString();
		
		b.reverse();
		
		b.swapnum();
		
		

	}

}

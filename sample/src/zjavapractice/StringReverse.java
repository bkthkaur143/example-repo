package zjavapractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String str = sc.nextLine();
		System.out.println(reverse(str));
		

	}
	
	public static String reverse(String in) 
	{
		if(in == null)
			throw new IllegalArgumentException("NULL is not valid input ....");
		StringBuilder out = new StringBuilder();
		
		
		
		char[] chars = in.toCharArray();
		for(int i=chars.length-1; i>=0;i--) 
			out.append(chars[i]);
		
		return out.toString();
	}

}

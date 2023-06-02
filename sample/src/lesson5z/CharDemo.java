package lesson5z;

import java.util.Scanner;

public class CharDemo 
{
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name.....");
		String input = scanner.nextLine();
		char a[] = input.toCharArray();
		
		for(int i =0;i<a.length;i++)
			System.out.println(a[i]+"\t");
		
	int upperCaseCount =0;
	int lowerCaseCount =0;
	
	System.out.println("your input :"+input);
	/*
	for(char ch:a)
		if(Character.isUpperCase(ch))
			upperCaseCount++;
		else if(Character.isLowerCase(ch))
			lowerCaseCount++;   */
	
	
	if(!input.isEmpty()) 
	{
       for(char ch: input.toCharArray()) 
       {
    	   if(!Character.isDigit(ch) && Character.isAlphabetic(ch))
    	   {
    		   if(Character.isUpperCase(ch)) 
    		   {
    			   upperCaseCount++;
    		   }
    		   else
    		   {
    			   lowerCaseCount++;
    			   
    		   }
    			   
    			   
    		  
    		   
    	   }
    	   
       }
			
			
				
		
	}
		
	
	System.out.println("UpperCaseCount : "+upperCaseCount);
	System.out.println("UpperCaseCount : "+lowerCaseCount);
	System.out.println("end program");
	scanner.close();	
	}

}

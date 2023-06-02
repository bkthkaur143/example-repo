package lesson5z;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Elapsed 
{

	public static void main(String[] args) throws IOException 
	{
		long start,end;
		int i=0,sum=0;
		String str=null;
		System.out.println("timing a for loop from o to 1,000,000");
		start = System.currentTimeMillis();
		
		for(int j=0; j < 1000000; j++) ;
		
		end = System.currentTimeMillis();
		
		System.out.println("Elapsed time : "+(end-start));
		
		BufferedReader br = new 
				BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("Enter 0 to quit ");
		    str = br.readLine();
			i=Integer.parseInt(str);
			if(i==0)
				System.exit(0);
			sum += i;
			System.out.println("current sum is "+sum);
			
		}while(i != 0);
		System.out.println("-------------------------------------------");
	}

}

package lesson5z;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
			System.out.println("whats your name........");
			String name = scanner.nextLine();
			if(name.isEmpty()) {
				break;
			}
			System.out.println("your name is "+name+ ". ");
			
		}
		scanner.close();
	    System.out.println("good bye ");
	}

}

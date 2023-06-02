package zjavapractice;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		String name;
		 System.out.println("Enter your Name  : ");
		 Scanner sc = new Scanner(System.in);
		 name= sc.nextLine();
		 
		 System.out.println("Your name is "+name);

	}

}

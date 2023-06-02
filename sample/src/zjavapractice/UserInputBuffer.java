package zjavapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class UserInputBuffer {

	public static void main(String[] args) throws IOException {
		String name;
		 System.out.println("Enter your Name  : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 name = reader.readLine();
		 System.out.println("Your name is "+name);


	}

}

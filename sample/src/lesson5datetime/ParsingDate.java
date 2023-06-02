package lesson5datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParsingDate 
{

	public static void main(String[] args) 
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format");
		String input = scanner.nextLine();
		
		LocalDate enteredDate = LocalDate.parse(input, formatter);
		
		System.out.println("Entered date :" +enteredDate);
		scanner.close();
	}

}

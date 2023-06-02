package lesson5z;

import java.util.Scanner;

public class ParseString {

	public static void main(String[] args) {
		String numbers = "12,5,8,3,9,10";
		Scanner scanner = new Scanner(numbers).useDelimiter(",");
		while(scanner.hasNext()) {
			int num = scanner.nextInt();
			if(num% 2 !=0) {
				System.out.println(num);
			}
		}
		scanner.close();

	}

}

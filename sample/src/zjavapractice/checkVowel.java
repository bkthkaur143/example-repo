package zjavapractice;

public class checkVowel {
	
	public static boolean vowelscheck(String input)
	{
		return input.toLowerCase().matches(".*[aeiou]*.");
	}

	public static void main(String[] args) {
		
		System.out.println(vowelscheck("thakur "));
		

				
	}

}

package lesson5String;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String(s1);
		
		System.out.println(s1 + " equal to "+ s2+" -> " +s1.equals(s2));
		
		System.out.println(s1 + " == "+ s2+" -> " +(s1==s2));
		
		String s3 = s1;
		
System.out.println(s1 + " equal to "+ s3+" -> " +s1.equals(s3));
		
		System.out.println(s1 + " == "+ s3+" -> " +(s1==s3));

	}

}

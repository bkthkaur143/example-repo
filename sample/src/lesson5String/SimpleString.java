package lesson5String;

public class SimpleString {

	public static void main(String[] args) 
	{
		char c[] = {'j','a','v','a'};
		String s1= new String(c);
		String s2= new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		String longstr = "string which are widely used in java"+ 
		                  "programming are a sequence of characters in the java programming language strings are objects"+
				           "The java platform provides the String class to create and manipulate strings ";
		System.out.println(longstr);

	}

}

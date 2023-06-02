package lesson6UseOfFinal;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstnceofExample 
{
	public static void main(String [] args)
	{
		Object testObject = LocalDate.now();
		if(testObject instanceof LocalDate)
			System.out.println("Object was an instance of the class java.time.LocalDate");
		else if (testObject instanceof LocalDateTime)
			System.out.println("Object was an instance of the class java.time.LocalDateTime");
		else
			System.out.println("Object was an instnce of the "+testObject.getClass());
	}

}

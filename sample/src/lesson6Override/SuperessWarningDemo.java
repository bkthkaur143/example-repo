package lesson6Override;

import java.util.Date;

public class SuperessWarningDemo 
{
	@SuppressWarnings("desrecation")

	public static void main(String[] args) 
	{
		SuperessWarningDemo annotationDemo = new SuperessWarningDemo();
		annotationDemo.getData();
		Date date = new Date();
		date.getClass();
		
	}
	@Deprecated
	public void getData()
	{
		
	}
	public void getNewDate()
	{
		
	}

}

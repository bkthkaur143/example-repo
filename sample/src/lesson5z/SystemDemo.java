package lesson5z;

import java.util.Date;

public class SystemDemo {

	
		@Override
		protected void finalize()  throws Throwable{
			System.out.println("Object about to get garbage collected");
			
		}
		
		public void methodX()
		{
			System.out.println("system properties are : " );
			System.out.println(System.getProperties());
			
			System.out.println("Current time in ms: "+System.currentTimeMillis());
			Date d = new Date(System.currentTimeMillis());
			System.out.println(d);
		}
		public static void main(String[] args) 
		{
			SystemDemo s1 = new SystemDemo();
			s1.methodX();
			
			new SystemDemo().methodX();
			
			System.err.append("1st ");
			System.err.append("2st ");
			System.err.println("this is error stream ");
			
			System.gc();//request garbage collector to run
			System.runFinalization();//calling finalize before garbage collection
			
			
			
			
	    }

}

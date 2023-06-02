package sample;

//class Ab
//{
//	public void show()
//	{
//		System.out.println("Bharat");
//	}
//}
//
//public class Anonymous {
//
//	public static void main(String[] args) {
//		Ab obj=new Ab() {
//				    public void show()
//		        {
//			         System.out.println("thakur");
//		        }
//		                 };
//		
//		                 obj.show();
//		
//
//	}
//
//} 
       //******************** interface without anonymous *******************************
//interface Abcd
//{
//	void show();
//}
//class Implementer implements Abcd
//{
//	public void show() {
//		System.out.println("anything");
//	}
//}
//public class Anonymous
//{
//
//	public static void main(String[] args) 
//	{
//		Abcd obj=new Implementer();
//		
//		                 obj.show();
//	}
//}


//******************** interface with anonymous *******************************
//interface Abcd
//{
//	void show();
//	
//}
//public class Anonymous
//{
//
//	public static void main(String[] args) 
//	{
//		Abcd obj=new Abcd()
//		   {
//			public void show()
//			{
//				System.out.println("i am the best");
//			}
//				
//	       };
//		
//		                 obj.show();
//	}
//}                 
//******************** lambda expression *******************************

interface Abcd
{
	void show();
	
}
public class Anonymous
{

	public static void main(String[] args) 
	{
		Abcd obj= () -> System.out.println("i am the best");
		
		obj.show();
	}
}                 

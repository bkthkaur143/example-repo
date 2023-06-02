package sample;

public class UserDefinedException 
{

	public static void main(String[] args) 
	{
		try 
		{
			int i =3;
			int j =4;
			int k =i/j;
			    if(k==0)
			    	throw new TeluskoException("this is not possible");
			System.out.println("k value is "+k);
			
		}
		catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
		}
		
		

	}

}

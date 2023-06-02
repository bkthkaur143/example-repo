package lesson3one;

import java.util.Random;

public class CommaOperators {

	public static void main(String[] args) {
		for(int i=1,j=i+10;i<5;i++,j=i*2)
		{
			System.out.println("i="+i+"j="+j);
		}
//**********************************************************************************************
		System.out.println(" left sift operator ");
		
		int i;
		int num=16;
		for(i=0;i<4;i++) 
		{
			num=num<<1;
		}
		System.out.println(num);
		
//**********************************************************************************************
				System.out.println(" prefix postfix operator ");	
		int numA=5;
		int numB=10;
		int numC=0;
		numC=--numA+numB--;
		System.out.println(numA);
		System.out.println(numB);
		System.out.println(numC);
		
//**********************************************************************************************
		System.out.println(" Relational and logical operator ");	
		
		Random rand=new Random(100);
		int x=rand.nextInt(100);
		int y=rand.nextInt(100);
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x>y ="+(x>y));
		System.out.println("x<y ="+(x<y));
		System.out.println("x>=y ="+(x>=y));
		System.out.println("x<=y ="+(x<=y));
		System.out.println("x==y ="+(x==y));
		System.out.println("x!=y ="+(x!=y));
		
		System.out.println("(x<10)&&(y<10) = "+((x<10)&&(y<10)));
		
		System.out.println("(x<10)||(y<10) = "+((x<10)||(y<10)));
		
//**********************************************************************************************
				System.out.println(" Relational and logical operator ");		
		
	}

}

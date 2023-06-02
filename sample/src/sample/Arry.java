package sample;

public class Arry {

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=3;
		num[1]=6;
		num[2]=9;
		num[3]=32;
	int	a[]= {5,6,7,8,9,0};
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("enhance for loop ");
		for(int r:a) {
			System.out.println(r);
		}
		
	int d[][]=
	{
			{5,6,7,8},
			{8,6,4,5},
			{8,7,6,5,4}
	};
	System.out.println("jagged \t"
			+ "array");
	
	for(int i=0;i<d.length;i++)
	{
		for(int j=0;j<d[i].length;j++) 
		{
			System.out.print(" "+d[i][j]);
		}
		System.out.println();
	}
	
	System.out.println("enhance for loop");
	for(int k[]:d)
	{
		for(int l:k)
		{
			System.out.print(" "+l);
		}
		System.out.println();
	}
		

	}

}

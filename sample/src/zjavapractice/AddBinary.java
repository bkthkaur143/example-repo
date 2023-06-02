package zjavapractice;

public class AddBinary 
{
	static String add_Binary(String x, String y)
	{
		String res="";
		
		int d=0;
		int k= x.length()-1,l=  y.length()-1;
		
		while(k>=0||l>=0||d==1) 
		{
			d+= ((k >= 0) ? x.charAt(k) -'0' : 0);
			d+= ((l >= 0) ? x.charAt(l) -'0' : 0);
			
			
			res = (char)(d%2 + '0') + res;
			d  /= 2;
			
			k--;
			l--;
	
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		
		String x = "1111";
		String y = "1010";
		
		 
		System.out.println(add_Binary(x,y));
		

	}

}

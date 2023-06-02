package lesson3;

public class LebbeldBreak {

	public static void main(String[] args) {
		int len =10;
		int key=5;
		int k=0;
		out:{
			for(int i=0;i<=len;i++)
			{
				in:{
					for(int j=0;j<=len;j++) 
					{
						if(len==key)
							break;
					}
					k+=1;
					
				}
				
			}
		}
		System.out.println(k);
		
	}

}

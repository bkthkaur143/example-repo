package lesson3;

public class ContinueExample {

	public static void main(String[] args) {
		int num=10;
		int sum=0;
		for(int i=0;i<=num;i++) 
		{
//			if(i==5)
//				break;
			if(i==6)
				continue;
			sum+=i;
		}
		System.out.println(sum);
	}

}

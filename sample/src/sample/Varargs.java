package sample;

class Calc{
	public int add(int...n) {
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}return sum;
	}
}

public class Varargs {

	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		System.out.println(obj.add(8,6,5,4,3,7,9,7,5));
	}
}


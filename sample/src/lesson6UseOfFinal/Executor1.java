package lesson6UseOfFinal;

public class Executor1 
{

	public static void main(String[] args) {
		Derived1 d = new Derived1();
		d.methodX();
		d.methodY();
		System.out.println("---------------------------------------------");
		
		Base1 b = new Base1();
		b.methodX();
		b.methodY();
		System.out.println("---------------------------------------------");
		
		Derived1 d1 = (Derived1)b;
		d1.methodX();
		d1.methodY();
		System.out.println("---------------------------------------------");
		
		Base1 b1= (Base1)d;
		b1.methodX();
		b1.methodY();
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("To invoke methodX from Base \n call super.methodX from Derived class");
	}

}

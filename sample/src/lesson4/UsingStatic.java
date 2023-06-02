package lesson4;

public class UsingStatic {
	
public	UsingStatic() 
{
	System.out.println("costructor invoked");
	
}

int var_instance;
static int var_static;

public void methodX() {
	var_static=4;
	var_instance=8;
	
}


	public static void main(String[] args) 
	{
		var_static=9;
		UsingStatic obj1 = new UsingStatic();
		obj1.var_instance=5;
		System.out.println("var_instance "+obj1.var_instance+" var_static "+var_static);
		System.out.println("after incrementing");
		obj1.var_static++;
		obj1.var_instance++;
		System.out.println("var_instance "+obj1.var_instance+" var_static "+var_static);

		
		
		
		System.out.println("create another object .................................");
		
		UsingStatic obj2 = new UsingStatic();
		
		obj2.var_static++;
		obj2.var_instance++;
		System.out.println("var_instance "+obj2.var_instance+" var_static "+var_static);
	}

}

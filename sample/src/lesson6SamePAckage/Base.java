package lesson6SamePAckage;

public class Base
{
	int var_default;
	public int var_public;
	private int var_private;
	protected int var_protected;
	
	void method_default() {
		System.out.println("default method from base class");
	}
	
	public void method_public() {
		System.out.println("public method from base class");
	}
	
	private void method_private() {
		System.out.println("private method from base class");
	}
	
	protected void method_protected() {
		System.out.println("protected method from base class");
	}

}

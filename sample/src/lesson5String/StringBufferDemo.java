package lesson5String;

public class StringBufferDemo {

	public static void main(String[] args) 
	{
		StringBuffer buffer = new StringBuffer("java   programming");
		System.out.println("Buffer : "+buffer);
		System.out.println("length : "+buffer.length());
		System.out.println("Capacity : "+buffer.capacity());
		
		String s;
		int a = 42;
		buffer = new StringBuffer(40);
		System.out.println("length : "+buffer.length() + " capacity "+buffer.capacity());
		
		s = buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		
		System.out.println(buffer.length()+":"+buffer.capacity());
		buffer = new StringBuffer("I Java!");
		buffer.insert(2, " like ");
		System.out.println(buffer);
		
		

	}

}

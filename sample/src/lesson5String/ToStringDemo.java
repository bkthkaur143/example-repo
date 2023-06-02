package lesson5String;

class Box{
	double height;
	double width;
	double depth;
	public Box(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public String toString(){
		return "dimentions are "+ height + "by "+width+ " by"+depth+"."; 
	}
}

public class ToStringDemo 
{
	public static void main(String [] args) 
	{
		Box box = new Box(10,20,30);
		
		String str="Box b:"+box;
		
		System.out.println(box);
		System.out.println(str);
		
	}

}

package lesson4;

class StaticBox
{
	double width;
	double height;
	double depth;
	
	static int count;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public StaticBox(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
		
	}
	public StaticBox() 
	{
		super();
		int count=0;
		count++;
		System.out.println("count is "+count);
		count++;
		
	}
	double calcvalue(){
		return width*height*depth;
	
}
	
}	
	

public class StaticBoxDemo {

	public static void main(String[] args) 
	{
		StaticBox box1 = new StaticBox();
	System.out.println(box1.calcvalue());	

	}

 }


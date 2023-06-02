package lesson4;

class Box
{
	double dblwidth;
	double dblheight;
	double dbldepth;
	
	public double getDblwidth() {
		return dblwidth;
	}
	public void setDblwidth(double dblwidth) {
		this.dblwidth = dblwidth;
	}
	public double getDblheight() {
		return dblheight;
	}
	public void setDblheight(double dblheight) {
		this.dblheight = dblheight;
	}
	public double getDbldepth() {
		return dbldepth;
	}
	public void setDbldepth(double dbldepth) {
		this.dbldepth = dbldepth;
	}
	public Box() {
		super();
		
	}
	
	public Box(double dblwidth, double dblheight, double dbldepth) {
		super();
		this.dblwidth = dblwidth;
		this.dblheight = dblheight;
		this.dbldepth = dbldepth;
	}
	
public void calcvalue() {
		double area = dblwidth*dblheight*dbldepth;
		System.out.println("box area is "+area );
		
	}
	
	
	
	
	
}

public class Boxdemo 
{

	public static void main(String args[]) 
	{
		Box b1=new Box(30,40,50);
		b1.calcvalue();
		
		Box b2=new Box(20,40,50);
		b2.calcvalue();
		
		
		
		
	}

}

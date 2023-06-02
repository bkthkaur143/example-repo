package sample;

class Construc{
	int x;
	int y;
	double z;
	Construc(int x ,int y){
		this.x=x;
		this.y=y;
		
		System.out.println( "x value is "+x);
		System.out.println( "y value is "+y);
	}
	Construc(int x ,int y ,double z){
		this.x=x;
		this.y=y;
		this.z=z;
		
		System.out.println( "x value is "+x);
		System.out.println( "y value is "+y);
		System.out.println( "z value is "+z);
		
	}
	
}


public class Costructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Construc obj=new  Construc(8,9);
	    Construc obj1=new  Construc(4,5,6.5);

	}

}




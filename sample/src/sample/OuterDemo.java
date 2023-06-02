package sample;

  class Oute{
	int i;
	
	void show() {
		System.out.println("Bharat");
	}
	class Inn{
		void show()
		{
			System.out.println("Rathore");
		}
	}
	
}

public class OuterDemo 
{

	public static void main(String[] args) 
	{
		
	Oute obj=new Oute();
	obj.show();
	Oute.Inn obj1=obj.new Inn();
	obj1.show();
	

	}

}

package sample;

class Emp{
	int id;
	int salary;
	static String ceo;
	
	public void show() {
		
		System.out.println(id+" ! "+salary+" ! "+ceo);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		Emp bharat=new Emp();
		bharat.id=1;
		bharat.salary=30000;
		bharat.ceo="thakur";
		Emp mariya=new Emp();
		mariya.id=2;
		mariya.salary=50000;
//		mariya.ceo="thakur";
		bharat.show();
		mariya.show();
		System.out.println("bharat");
		
		
	}

}

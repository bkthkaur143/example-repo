package sample;

class Encap
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation
{
	public static void main(String[] args)
	{
		Encap obj=new Encap();
		obj.setRollno(5);
		obj.setName("bharat");
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());
	}

}

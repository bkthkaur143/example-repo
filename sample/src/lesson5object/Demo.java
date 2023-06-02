package lesson5object;

class Student
{
	private int rollNo;
	private String name;
	private float percentage;
	private String contactNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", contactNo="
				+ contactNo + "]";
	}
	
	
	
	
	
	
}

public class Demo 
{

	public static void main(String[] args) 
	{
		/*Student obj1 = new Student();
		obj1.setRollNo(101);
		obj1.setName("bharat ");
		obj1.setPercentage(75.65f);
		obj1.setContactNo("9131134379");
		System.out.println(obj1);
		
		Student obj2 = new Student();
		obj2.setRollNo(102);
		obj2.setName("Rakesh ");
		obj2.setPercentage(70.65f);
		obj2.setContactNo("7023343862");
		System.out.println(obj2);
		*/
		
		
		String str1 = new String("java programming");
		System.out.println("str1 is "+str1);
		System.out.println("lenth : "+str1.length());
		System.out.println("Index of p : "+str1.indexOf("p"));
		System.out.println("subdtring : "+ str1.substring(5,12));
		System.out.println("valueof : "+ str1.valueOf(6));
		System.out.println("concat : "+str1.concat(" development"));
		
		String ss= "Hello";
		int n =ss.indexOf("1")+1;
		System.out.println(ss.indexOf("1",n));
		System.out.println("first occurrence of a in java programing : "+str1.indexOf("a"));
		System.out.println("lats occurrence of a in java programming : "+str1.lastIndexOf("a"));
		System.out.println(str1.charAt(5));
		str1="    String    ";
		System.out.println(str1+str1.length());
		
		String s1="java";
		String s2= "fullstack";
		String s3= s1 +" " +s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}

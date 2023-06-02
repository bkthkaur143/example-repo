package lesson5object;

class Employee1
{
	String eName;
	byte eAge;
	double eSalary;
	
	public Employee1(String eName, byte eAge, double eSalary) {
		super();
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}
	@Override
	public boolean equals(Object arg0) {
		Employee1 a=(Employee1) arg0;
		if(a.eSalary==this.eSalary)
			return true;
		else
			return false;
		
	}
}

public class ObjectDemo3
{
	public static void main(String [] args) 
	{
		Employee1 a1 = new Employee1("bharat",(byte)22,50000);
		Employee1 a2 = new Employee1("Praveen",(byte)21,40000);
		Employee1 a3 = new Employee1("Rakesh",(byte)23,450000);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
System.out.println("checking with equal method ........................................... ");
		
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println(a3.equals(a1));
		
System.out.println("checking with == method ........................................... ");
		
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a3==a1);
		
		System.out.println(a1+"\n"+a2+"\n"+a3);
	}

}

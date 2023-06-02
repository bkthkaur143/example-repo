package lesson5object;

class Employee{
	String eName;
	byte eAge;
	double eSalary;
	public Employee(String eName, byte eAge, double eSalary) {
		super();
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eAge=" + eAge + ", eSalary=" + eSalary + "]";
	}
	
}

public class ObjectDemo2 
{

	public static void main(String[] args) 
	{
		Employee a1 = new Employee("bharat",(byte)22,50000);
		Employee a2 = new Employee("Praveen",(byte)21,40000);
		Employee a3 = new Employee("Rakesh",(byte)23,450000);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
		System.out.println("checking with equal method ........................................... ");
		
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println(a3.equals(a1));
		
		System.out.println("assigning a2 to a1 refrence .............................................");
		
		a1=a2;
		
		System.out.println("checking hashcode a1 or a2,..............................................");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		System.out.println(a1);
		System.out.println(a2);
	}

}

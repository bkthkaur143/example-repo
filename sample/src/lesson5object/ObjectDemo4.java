package lesson5object;

class Employee2
{
	String eName;
	byte eAge;
	double eSalary;
	
	public Employee2(String eName, byte eAge, double eSalary) {
		super();
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee1 [eName=" + eName + ", eAge=" + eAge + ", eSalary=" + eSalary + "]";
	}

	
		
	
}

public class ObjectDemo4 {

	public static void main(String[] args) 
	{
		Employee2 a1 = new Employee2("bharat",(byte)22,50000);
		Employee2 a2 = new Employee2("Praveen",(byte)21,40000);
		Employee2 a3 = new Employee2("Rakesh",(byte)23,450000);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		

	}

}

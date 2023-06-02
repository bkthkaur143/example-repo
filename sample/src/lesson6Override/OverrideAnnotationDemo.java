package lesson6Override;

public class OverrideAnnotationDemo
{
	public class Employee{
		private String empName="Ram";
		
		@Override
		public String toString() {
			return "EmpName is :"+empName;
		}
	}

}

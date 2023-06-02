package lesson4;

enum Months
{
	jan(31), feb(28), mar(31), apr(30), may(31), jun(30), july(31), aug(31), sep(30), oct(31), nov(30), dec(31);
	
	Months(int days){
		this.days=days;
	}
	private int days;
	
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
}

public class EnumMonths {

	public static void main(String[] args) 
	{
		System.out.println("Days in the month of april "+Months.apr.getDays());
		System.out.println("Days in the month of june "+Months.jun.getDays());

	}

}

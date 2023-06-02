package lesson5datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class CaluculatingPeriod 
{
	
	public static void main(String[] args) 
	{
		LocalDate start = LocalDate.of(2022, Month.SEPTEMBER, 24);
		LocalDate end = LocalDate.now();
		
		Period period= start.until(end);
		
		System.out.println("Days :"+period.getDays());
		System.out.println("Months :"+period.getMonths());
		System.out.println("Years :"+period.getYears());
	}

}

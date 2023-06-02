package lesson5datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTime {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate independanceDay = LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println("Independance :"+ independanceDay);
		System.out.println("Today :"+ currentDate);
		System.out.println("Tomorrow :"+ currentDate.plusDays(5));
		System.out.println("Last Month :"+ currentDate.minusMonths(2));
		System.out.println("Is Leap? :"+ currentDate.isLeapYear());
		System.out.println("move to 5th day of month :"+ currentDate.withDayOfMonth(6));
		System.out.println("number of day in this month"+ currentDate.lengthOfMonth());

	}

}

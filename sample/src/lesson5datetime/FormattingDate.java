package lesson5datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDate {

	public static void main(String[] args)
	{
//		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//		LocalDate currentDate = LocalDate.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		
//	System.out.println(currentDate.format(formatter));	
	System.out.println(currentDateTime.format(formatter1));

	}

}

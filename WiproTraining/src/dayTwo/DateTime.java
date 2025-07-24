package dayTwo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {

		// Display current Date
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);

		// Display Current time
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);

		// Display Date time
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println(myDateTime);

		// Date time Format
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Date Before Format :" +myDateObj);
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("DD-MM-YYYY HH:MM:SS");
		String formattedDate = myDateObj.format(myFormat);
		System.out.println("Formatted Date: " +formattedDate);

		

	}
}
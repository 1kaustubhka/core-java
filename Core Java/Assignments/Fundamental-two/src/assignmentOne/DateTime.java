package assignmentOne;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTime {


	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("Date: "+d);
		
		LocalTime t = LocalTime.now();
		System.out.println("Time: "+t);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getActualMaximum(Calendar.DATE));
	}
}

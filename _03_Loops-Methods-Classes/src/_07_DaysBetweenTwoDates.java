
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Start date: ");
		String start = inp.nextLine();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = simpleDateFormat.parse(start);
        
        System.out.print("End date: ");
		String end = inp.nextLine();
        Date date2 = simpleDateFormat.parse(end);
        
        long duration = date1.getTime() - date2.getTime();
        long diffDays = TimeUnit.MILLISECONDS.toDays(duration);
        
        System.out.println(Math.abs(diffDays));
	}

}


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CurrentDateTime {

	public static void main(String[] args) {
		DateFormat currDate = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		System.out.println(currDate.format(date));
		System.out.println("or other format");
		System.out.println(date);
	}

}

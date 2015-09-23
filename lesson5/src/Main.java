import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss.SSS dd.MM.Y");
		System.out.println(format.format(date));
		Calendar calendar=new GregorianCalendar();
		System.out.println(calendar.getTime());
	}
}

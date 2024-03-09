/**
 * @author
 */

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

/**
 * TODO
 *
 * @author X11LOR
 * @version $Revision$
 *
 */
public class TestDateUTC {

	/**
	 * 
	 */
	public TestDateUTC() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("TestDateUTC");
			System.out.println("-----------");
			
			String dateString = "2024-02-26T14:01:27.967Z";
			
			String dateFormatPattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
			
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormatPattern);
			
			System.out.println("Datums-String: " + dateString);
			System.out.println("Format-Pattern: " + dateFormatPattern);
			
			System.out.println("----------------------------------------");
			
			System.out.println("TimeZone Default: "  + TimeZone.getDefault().getID() +  " (" + (TimeZone.getDefault().getRawOffset() / 1000 / 60 / 60) + "h)");
			
			System.out.println("Datum-Parse: " + sdf.parse(dateString));
			System.out.println("Aktuelles Datum lokal: " + new Date());
			
			System.out.println("----------------------------------------");
			
			TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
			System.out.println("TimeZone change to UTC: "  + TimeZone.getDefault().getID() +  " (" + (TimeZone.getDefault().getRawOffset() / 1000 / 60 / 60) + "h)");
			
			//sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
			
			System.out.println("Datum-Parse: " + sdf.parse(dateString));
			System.out.println("Aktuelles Datum UTC: " + new Date());
			
			System.out.println("----------------------------------------");
			
			TimeZone.setDefault(null);
			System.out.println("TimeZone Reset: "  + TimeZone.getDefault().getID() +  " (" + (TimeZone.getDefault().getRawOffset() / 1000 / 60 / 60) + "h)");
			
			System.out.println("Datum-Parse: " + sdf.parse(dateString));
			System.out.println("Aktuelles Datum lokal: " + new Date());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

/*
 * $Log$
 */

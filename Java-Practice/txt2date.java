import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class txt2date {
	

	public static java.util.Date textToDate(String a) {
		Pattern pattern = Pattern.compile("(\\d*)-(\\D*)-(\\d\\d\\d\\d)");   //give the pattern to compare
		Pattern pattern1 = Pattern.compile("(\\d*)/(\\d*)/(\\d\\d\\d\\d)");
		Pattern pattern2 = Pattern.compile("(\\D*) (\\d*), (\\d\\d\\d\\d)");
		Pattern pattern3 = Pattern
				.compile("(\\D*), (\\D*) (\\d*) (\\d\\d\\d\\d)");
		Matcher m = pattern.matcher(a);       //match the input date pattern with available date patterns 
		Matcher m1 = pattern1.matcher(a);
		Matcher m2 = pattern2.matcher(a);
		Matcher m3 = pattern3.matcher(a);

		Date date = null;
		if (m.matches()) {    //if the input date pattern matches with any of the defined patterns then the input date is parsed to display the date in standard format
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

			try {
				 date = formatter.parse(a);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (m1.matches()) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

			try {
				date = formatter.parse(a);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (m2.matches()) {
			SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");

			try {
				date = formatter.parse(a);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (m3.matches()) {
			SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy");

			try {
				date = formatter.parse(a);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Unknown Data Format");
		}
		return date;
	}
	public static void main(String[] args) {
		 
		System.out.println(txt2date.textToDate("06-may-2014"));
		System.out.println(txt2date.textToDate("Tue, may 06 2014"));
		System.out.println(txt2date.textToDate("may 20, 2015"));

	}

}

package org.hazi.Threads.ThreadsPart3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class FordsTimeTest {

	public static void main(String[] args) {
		String DELIMITER = ";";
		// String BCRIS_NUMBER_TIMEFRAME = "BCRIS_NUMBER" + ".timeFrame";

		Date now = new Date();

		String downtimePattern = "sun1000-sun1800;mon0700-mon2300;tue0700-tue2300;wed0700-wed2300;thu0700-thu2300;fri0700-fri2300;sat0700-sat2100";

		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.getTime());

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);

		System.out.println("dayOfWeek: " + dayOfWeek + "hour: " + hour + "minute: " + minute);

		int timeNb = dayOfWeek * 10000 + hour * 100 + minute;
		StringTokenizer st = new StringTokenizer(downtimePattern, DELIMITER);

		while (st.hasMoreTokens()) {

			String timeframe = st.nextToken();

			if (timeframe.length() != 15) {
				System.out.println("Invalid timeframe (length is incorrect): " + timeframe);
			}

			String strBeginTime = timeframe.substring(0, 7);
			String strEndTime = timeframe.substring(8, 15);

			// Transform the begin and end time in numerical format.
			int beginTimeNb = getTimeNb(strBeginTime);
			int endTimeNb = getTimeNb(strEndTime);

			if (beginTimeNb < endTimeNb) {
				if (timeNb >= beginTimeNb && timeNb < endTimeNb) {
					System.out.println("time is valid");
					System.exit(0);
				}

			} else {
				if (timeNb >= beginTimeNb || timeNb < endTimeNb) {
					System.out.println("time is valid");
					System.exit(0);
				}
			}

		}
		System.out.println("time is invalid");

	}

	private static int getTimeNb(String timePattern) {

		if (timePattern.length() < 7) {
			System.out.println("Invalid time pattern: " + timePattern);
		}

		// Extract the day, hour and minute from the String.
		String strDayOfWeek = timePattern.substring(0, 3);
		String strHour = timePattern.substring(3, 5);
		String strMinute = timePattern.substring(5, 7);

		int dayOfWeek = 0;
		int hour;
		int minute;

		// Evaluate the numerical value of the day.
		if ("sun".equalsIgnoreCase(strDayOfWeek)) {
			dayOfWeek = Calendar.SUNDAY;
		} else if ("mon".equalsIgnoreCase(strDayOfWeek)) {
			dayOfWeek = Calendar.MONDAY;
		} else if ("tue".equalsIgnoreCase(strDayOfWeek)) {
			dayOfWeek = Calendar.TUESDAY;
		} else if ("wed".equalsIgnoreCase(strDayOfWeek)) {
			dayOfWeek = Calendar.WEDNESDAY;
		} else if ("thu".equalsIgnoreCase(strDayOfWeek)) {
			dayOfWeek = Calendar.THURSDAY;
		} else if ("fri".equalsIgnoreCase(strDayOfWeek)) {
			dayOfWeek = Calendar.FRIDAY;
		} else if ("sat".equalsIgnoreCase(strDayOfWeek)) {
			dayOfWeek = Calendar.SATURDAY;
		} else {
			System.out.println("Invalid time pattern (unknown day of the week): " + timePattern);
		}

		hour = Integer.parseInt(strHour);

		minute = Integer.parseInt(strMinute);

		int result = dayOfWeek * 10000 + hour * 100 + minute;

		return result;
	}

}

// this program calculates the number of days from a given
// date to the beginning of the year
public class App2 {
	public static void main(String args[]) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

		// initialize accumulator to zero
		int dayInYear = 0;

		// now loop through the months, adding
		// in the number of days in each month
		for (int m = 1; m < month; m++) {
			switch (m) {
			case 4:
			case 6:
			case 9:
			case 11:
				dayInYear += 30;
				break;

			// in February, gotta' consider leap year
			case 2:
				dayInYear += 28;

				if (((year % 4) == 0) && ((year % 100) != 0)) {
					dayInYear++;
				}

				else if ((year % 400) == 0) {
					dayInYear++;
				}

				break;

			// all the rest have 31 days
			default:
				dayInYear += 31;
			}
		}
		// now add in the day of the current month
		dayInYear += day;

		System.out.print(month + "-" + day + "-" + year);
		System.out.println(" is day number " + dayInYear + " in the year");
	}
}

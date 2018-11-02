import java.util.Scanner;

public class PA7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year and day to start on (Sunday = 0)");
		int year = scanner.nextInt();
		int getStartDay = scanner.nextInt();


		int january = 31;
		int febuary = 28;
		int march = 31;
		int april = 30;
		int may = 31;
		int june = 30;
		int july = 31;
		int august = 31;
		int september = 30;
		int october = 31;
		int november = 30;
		int december = 31;

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		if (isLeapYear == true) {
			febuary = 29;
		}
		int i = 0;
		for (i = 0; i < january; i++) {
			System.out.printf("%4d", i);	
		}
	}

	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	public static void printMonthTitle(int year, int month) {
		System.out.println("         " + getMonthName(month)
		+ " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	public static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month, 1);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		int i;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
		}

		System.out.println();
	}

}

/** code from similar problem CH6 PROB34
import java.util.Scanner;
public class PROB34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a full year: ");
		int year = scanner.nextInt();

		System.out.print("Enter a month in number form between 1 and 12: ");
		int month = scanner.nextInt();

		printMonth(year, month);
	}
	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	public static void printMonthTitle(int year, int month) {
		System.out.println("         " + getMonthName(month)
		+ " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December";
		}

		return monthName;
	}
	public static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month, 1);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		int i;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}
	public static int getStartDay(int year, int month, int day) {
		if (month == 1) {
			month = 13;
			year--;
		} else if (month == 2) {
			month = 14;
			year--;
		}
		int k = year % 100;
		int j = year / 100;
		return ((day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) - 1) % 7;
	}
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2) return isLeapYear(year) ? 29 : 28;
		return 0; 
	}
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}

CH4 PROB17
import java.util.Scanner;

public class PROB17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year (2014): " );
		int year = scanner.nextInt();
		System.out.print("Enter a month (Jul): " );
		String month = scanner.next();
		scanner.close();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		int january = 31;
		int febuary = 28;
		int march = 31;
		int april = 30;
		int may = 31;
		int june = 30;
		int july = 31;
		int august = 31;
		int september = 30;
		int october = 31;
		int november = 30;
		int december = 31;

		if (isLeapYear == true) {

		}

		int monthNumber;

		switch (month) {
		case "Jan":
			monthNumber = 1; System.out.println("January has " + january + " days");
			break;
		case "Feb":
			monthNumber = 2; 
			if (isLeapYear == true) {
				System.out.println("Febuary has 29 days");
			} else {
			System.out.println("January has " + febuary + " days");
			}
			break;
		case "Mar":
			monthNumber = 3; System.out.println("January has " + march + " days");
			break;
		case "Apr":
			monthNumber = 4; System.out.println("January has " + april + " days");
			break;
		case "May":
			monthNumber = 5; System.out.println("January has " + may + " days");
			break;
		case "Jun":
			monthNumber = 6; System.out.println("January has " + june + " days");
			break;
		case "Jul":
			monthNumber = 7; System.out.println("January has " + july + " days");
			break;
		case "Aug":
			monthNumber = 8; System.out.println("January has " + august + " days");
			break;
		case "Sep":
			monthNumber = 9; System.out.println("January has " + september + " days");
			break;
		case "Oct":
			monthNumber = 10; System.out.println("January has " + october + " days");
			break;
		case "Nov":
			monthNumber = 11; System.out.println("January has " + november + " days");
			break;
		case "Dec":
			monthNumber = 12; System.out.println("January has " + december + " days");
			break;
		default:
			monthNumber = 0;
			break;


			}
		}

	}
 */

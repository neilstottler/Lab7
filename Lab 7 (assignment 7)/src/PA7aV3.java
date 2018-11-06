import java.util.Scanner;
public class PA7aV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a full year: ");
		int year = scanner.nextInt();

		System.out.print("Enter a month in number form between 1 and 12: ");
		int month = scanner.nextInt();

		/**printMonth(year, month);
			month = 2;
			printMonth(year, month);
			month = 3;
			printMonth(year, month);
			month = 4;
			printMonth(year, month);
			month = 5;
			printMonth(year, month);
			month = 6;
			printMonth(year, month);
			month = 7;
			printMonth(year, month);
			month = 8;
			printMonth(year, month);
			month = 9;
			printMonth(year, month);
			month = 10;
			printMonth(year, month);
			month = 11;
			printMonth(year, month);
			month = 12;
			printMonth(year, month);
			month = 13;
		 


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
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); */
	}
}
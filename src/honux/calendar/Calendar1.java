package honux.calendar;

import java.util.Scanner;

public class Calendar1 {

	private static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] Leap_Max_Days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int Year) {
		if (Year % 4 == 0 && (Year % 100 != 0 || Year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDaysOfMonth(int Year, int Month) {
		if (isLeapYear(Year)) {
			return Leap_Max_Days[Month - 1];
		} else {
			return Max_Days[Month - 1];
		}

	}

	public void printCalendar(int Year, int Month, int Weekday) {
		System.out.printf("<<%4d년%3d월>>%n", Year, Month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");

		for(int i = 0; i<Weekday; i++) {
			System.out.print("   ");
		}
		
		int maxDay = getMaxDaysOfMonth(Year, Month);
		
		for(int i = 1; i<=7-Weekday; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		for (int i = 8-Weekday; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 7-Weekday)
				System.out.println();
		}
		System.out.println();
		

//		System.out.println(" 1   2   3    4    5   6    7");
//		System.out.println(" 8   9  10   11   12  13   14");
//		System.out.println("15  16  17   18   19  20   21");
//		System.out.println("22  23  24   25   26  27   28");
	}
}

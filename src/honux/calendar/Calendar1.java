package honux.calendar;

import java.util.Scanner;

public class Calendar1 {

	private static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int Month) {
		return Max_Days[Month - 1];
	}

	public static void main(String[] args) {
//		System.out.println("일  월   화    수   목   금    토");
//		System.out.println("-----------------------------");
//		System.out.println(" 1   2   3    4    5   6    7");
//		System.out.println(" 8   9  10   11   12  13   14");
//		System.out.println("15  16  17   18   19  20   21");
//		System.out.println("22  23  24   25   26  27   28");

		Scanner scanner = new Scanner(System.in);
		Calendar1 cal = new Calendar1();
		String PROMPT = "Cal> ";

		int Month = 0;
		while (true) {
			System.out.println("원하시는 달을 입력하세요.");
			System.out.print(PROMPT);
			Month = scanner.nextInt();
			if (Month == -1) {break;}
			if (Month > 12) {continue;}
			System.out.println(Month + "월의 마지막 날은 " + cal.getMaxDaysOfMonth(Month) + "입니다");
		}
		System.out.println("Have a nice day!");

		scanner.close();

	}

}

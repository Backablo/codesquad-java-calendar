package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar1 cal = new Calendar1();
		int Year = 0;
		int Month = 0;
		while (true) {
			System.out.println("원하시는 년도를 입력하세요.");
			System.out.print(PROMPT);
			Year = scanner.nextInt();
			System.out.println("원하시는 달을 입력하세요.");
			System.out.print(PROMPT);
			Month = scanner.nextInt();
			if (Month == -1) {
				break;
			}
			if (Month > 12) {
				continue;
			}
			cal.printCalendar(Year, Month);
		}
		System.out.println("Have a nice day!");

		scanner.close();
	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();

	}

}

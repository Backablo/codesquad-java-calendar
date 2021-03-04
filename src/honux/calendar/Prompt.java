package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String Week) {
		if(Week.equals("SU")) return 0;
		else if(Week.equals("MO")) return 1;
		else if(Week.equals("TU")) return 2;
		else if(Week.equals("WE")) return 3;
		else if(Week.equals("TH")) return 4;
		else if(Week.equals("FR")) return 5;
		else if(Week.equals("SA")) return 6;
		else 
			return 0;
	}
	
	
	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar1 cal = new Calendar1();
		int Year = 0;
		int Month = 0;
		int Weekday = 0;
		while (true) {
			System.out.println();
			System.out.println("원하시는 년도를 입력하세요.");
			System.out.print(PROMPT);
			Year = scanner.nextInt();
			System.out.println("원하시는 달을 입력하세요.");
			System.out.print(PROMPT);
			Month = scanner.nextInt();
			System.out.println("원하는 요일을 입력하세요(SU MO TU WE TH FR SA)");
			System.out.print(PROMPT);
			String str_weekday = scanner.next();
			Weekday = parseDay(str_weekday);
			
			if (Month == -1) {
				break;
			}
			if (Month > 12) {
				continue;
			}
			cal.printCalendar(Year, Month, Weekday);
		}
		System.out.println("Have a nice day!");

		scanner.close();
	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();

	}

}

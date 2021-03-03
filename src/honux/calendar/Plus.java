package honux.calendar;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a, b;
		String s1, s2;
		System.out.println("두 수를 입력하세요.");
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("두 수의 합은 %d입니다", a + b);
		scanner.close();

//		String twoNumber = scanner.nextLine();
//		String[] oneNumber = twoNumber.split(" ");
//		int first = Integer.parseInt(oneNumber[0]);
//		int secound = Integer.parseInt(oneNumber[1]);
//		System.out.println("두수의 합은 " + (first + secound));

//		String inputvalue = scanner.nextLine();
//		String[] splitvalue = inputvalue.split(" ");
//		int first = Integer.parseInt(splitvalue[0]);
//		int secound = Integer.parseInt(splitvalue[1]);
//		
//		System.out.println("두 수의 합은 "+(first+secound)+"입니다.");

	}

}

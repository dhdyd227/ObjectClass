package hello;
//Calendar api 활용하여 달력만들기
import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		int month=sc.nextInt();
		
		System.out.println("        << "+year+" 년"+month+"월 >>");
		getCal(year,month-1);

	}

	public static void getCal(int year, int month) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		for (String str : week)
			System.out.print(" " + str);

		System.out.println();

		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 1);
		int startday = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 0; i < startday - 1; i++)
			System.out.printf("    ");

		for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			System.out.printf("%4d", i);
			if ((i + startday - 1) % 7 == 0)
				System.out.println();
		}
		/*
		 * System.out.println("년: " + cal.get(Calendar.YEAR)); //년도 출력
		 * System.out.println("월: " + cal.get(Calendar.MONTH)); //월 출력
		 * System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); //일요일 1 ,월요일 2,
		 * 화요일 3 System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
		 * System.out.println("---------------------------");
		 * System.out.println("전체일수: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));//전체일수
		 */

	}
}

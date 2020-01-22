package hello;
//Calendar api Ȱ���Ͽ� �޷¸����
import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		int month=sc.nextInt();
		
		System.out.println("        << "+year+" ��"+month+"�� >>");
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
		 * System.out.println("��: " + cal.get(Calendar.YEAR)); //�⵵ ���
		 * System.out.println("��: " + cal.get(Calendar.MONTH)); //�� ���
		 * System.out.println("����: " + cal.get(Calendar.DAY_OF_WEEK)); //�Ͽ��� 1 ,������ 2,
		 * ȭ���� 3 System.out.println("��: " + cal.get(Calendar.DAY_OF_MONTH));
		 * System.out.println("---------------------------");
		 * System.out.println("��ü�ϼ�: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));//��ü�ϼ�
		 */

	}
}

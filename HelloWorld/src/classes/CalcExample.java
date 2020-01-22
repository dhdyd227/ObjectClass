package classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		int number1=sc.nextInt(),
				number2=sc.nextInt();
		
		cal.execute(number1,number2);
		Calculator.plus(23.5, 10.2);
	}

}

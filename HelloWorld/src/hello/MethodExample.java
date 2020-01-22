package hello;

import java.util.Scanner;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println(args[0]);
		showName();		
		showAge(30);
		showMe(170.5,30.3);
		System.out.println(sum(4,5));
		System.out.println(args[1]);
		
		System.out.println(sum(7,3));
		System.out.println(minus(7,3));
		System.out.println(multi(7,3));
		System.out.println(div(7,3));
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("키는?");

		//double tall=sc.nextDouble();
		
		//System.out.println("적정몸무게="+weight(tall));
		
		int[] intAry = {2,3,4,5,6};
		int sum = sum2(intAry);
		
		System.out.println("배열합="+sum );
			
	}
	
	public static int sum2(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
	public static double weight(double a) {
		return (a-100)*0.9;
	}
	
	public static int sum(int a , int b) {
		return a+b;
	}
	
	public static double minus(double a , double b) {
		return a-b;
	}
	
	public static double multi(double a , double b) {
		return a*b;
	}
	
	public static double div(double a , double b) {
		return a/b;
	}
	
	
	
	public static void showMe(double height,double weight) {
		System.out.println("I am "+height+" cm and " +weight+" kg");
	}
	
	public static void showAge(int age) {
		System.out.println("I am "+ age + " years old.");
	}

	public static void showName() {
		System.out.println("Hello, my name is KwonOhYong");
	}
	
}

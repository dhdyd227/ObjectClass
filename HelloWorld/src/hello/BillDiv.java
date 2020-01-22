package hello;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BillDiv {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalmoney;
		System.out.print("µ· ¾ó¸¶?");
		totalmoney =sc.nextInt();
		int[] bills=new int[8];
		int[] billwon=new int[] {50000,10000,5000,1000,500,100,50,10};
	
		for(int i=0 ; i<billwon.length;i++) {
			bills[i]=totalmoney/billwon[i];
			totalmoney -= billwon[i]*bills[i];
		}
		
		for(int i=0 ; i<billwon.length;i++) {
			System.out.println(billwon[i]+": "+bills[i]);
		}
			List<Object> Array = new ArrayList<Object>();
			
	}
}

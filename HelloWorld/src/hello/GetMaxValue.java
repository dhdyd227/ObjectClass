package hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		
		int ary[]  =new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		int max=0;
		for(int i=0; i<ary.length;i++)
		{
			System.out.println("input int type");
			ary[i]= sc.nextInt();
			max=(max<ary[i] ? ary[i]:max);
		}
		
		System.out.println("�ִ밪= "+max);
		
	}

}

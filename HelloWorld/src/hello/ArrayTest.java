package hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ary = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0; i<ary.length;i++)
		{
		System.out.println("input int type");
		ary[i]= sc.nextInt();
		}
		
		for(int i=0; i<ary.length;i++)
		{
		System.out.print(ary[i]+" ");
		sum+=ary[i];
		}
		System.out.print("\n"+sum);

	}
	
	

}

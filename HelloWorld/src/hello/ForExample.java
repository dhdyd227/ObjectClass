package hello;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		//4-3
		/*int result=0;
		for(int i=0;i<100;i=(i+3))
		{
			result+=i;
		}
		System.out.println("3�� ����� ��"+result);
		*/
		
		//4-4
		/*
		int dice1,dice2;
		
		while(true)
		{
			dice1=(int)(Math.random()*100)%7;
			dice2=(int)(Math.random()*100)%7;
			System.out.println("("+dice1+","+dice2+")");
			
			if((dice1+dice2) == 5)
			{
				System.out.println("�� 5 ����");
				break;
			}	
		}
		*/
		
		
		//4-5
		/*
		int x,y;
				
		System.out.println("4x+5y=60");

		for(x=0;x<=10;x++)
		{
			for(y=0;y<=10;y++)
			{
				if(((4*x)+(5*y))==60)
				{
					System.out.println("("+x+","+y+")");
				}
			}
		}
		*/
		
		//4-6
		/*
		int x,y;
		
		for(x=0;x<=10;x++)
		{
			for(y=0;y<=x;y++)
			{
					System.out.print("*");
			}
					System.out.println();
		}
		*/
		
		//4-5
		/*
		boolean run = true;
		int balance =0;
		int check;
		Scanner scanner = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("----------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------");
			System.out.print("����>");
			check=scanner.nextInt();
			switch(check)
			{
			case 1:
				System.out.print("���ݾ�>");
				balance +=scanner.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�>");
				balance -=scanner.nextInt();
				break;
			case 3:
				System.out.println("�ܰ�>"+balance);
				break;
			case 4:
				run=false;
				break;
			default:
				break;
			}

		}
		
		System.out.println("���α׷� ����");
		*/

	}

}

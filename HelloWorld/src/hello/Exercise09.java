package hello;

import java.util.Scanner;

public class Exercise09 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
			int selectNo =scanner.nextInt();
			
			if(selectNo ==1) //1.�л���
			{
				System.out.print("�л���>");
				studentNum=scanner.nextInt();
				scores = new int[studentNum];
			
			}
			else if(selectNo ==2)  //2.�����Է�
			{
				for(int i=0;i<studentNum;i++)
				{
					System.out.print("scores["+i+"]>");
					scores[i]=scanner.nextInt();
				}
				
			}
			else if(selectNo ==3) //3.��������Ʈ
			{
				for(int i=0;i<studentNum;i++)
				{
					System.out.println("scores["+i+"]>"+scores[i]);
				}
			}
			else if(selectNo ==4)//4.�м� �ְ����� ,��� ����
			{
				int maxscore=0;
				double avgscore=0.00;
				for(int i=0;i<studentNum;i++)
				{
					maxscore=(maxscore<scores[i] ? scores[i]:maxscore);
					avgscore += scores[i];
				}
				System.out.println("�ְ� ����:"+maxscore);
				
			
				System.out.printf("��� ����: %.3f\n",(avgscore/studentNum));
				
			}
			else if(selectNo ==5)
			{
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
		
	}

}

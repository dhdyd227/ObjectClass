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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo =scanner.nextInt();
			
			if(selectNo ==1) //1.학생수
			{
				System.out.print("학생수>");
				studentNum=scanner.nextInt();
				scores = new int[studentNum];
			
			}
			else if(selectNo ==2)  //2.점수입력
			{
				for(int i=0;i<studentNum;i++)
				{
					System.out.print("scores["+i+"]>");
					scores[i]=scanner.nextInt();
				}
				
			}
			else if(selectNo ==3) //3.점수리스트
			{
				for(int i=0;i<studentNum;i++)
				{
					System.out.println("scores["+i+"]>"+scores[i]);
				}
			}
			else if(selectNo ==4)//4.분석 최고점수 ,평균 점수
			{
				int maxscore=0;
				double avgscore=0.00;
				for(int i=0;i<studentNum;i++)
				{
					maxscore=(maxscore<scores[i] ? scores[i]:maxscore);
					avgscore += scores[i];
				}
				System.out.println("최고 점수:"+maxscore);
				
			
				System.out.printf("평균 점수: %.3f\n",(avgscore/studentNum));
				
			}
			else if(selectNo ==5)
			{
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

}

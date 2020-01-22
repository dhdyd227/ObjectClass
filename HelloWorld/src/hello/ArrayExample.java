package hello;

public class ArrayExample {
	public static void main(String[] args) {
			int a=10,b=20,c=30;
			int sum=10;
			
			int[] intAry= {10,20,30,40,50,60};
			
			String[] strAry= {"Nice","Good","Hello"};
			System.out.println(intAry[0]);	
			System.out.println(strAry[0]);
					
			for(int i=0 ; i<3 ; i++)
			{
				System.out.println(strAry[i]);
			}
			
			for(int i=0 ; i<6 ; i++)
			{
				System.out.println(strAry[1]);		
			}
			
			System.out.println("strAryÀÇ Å©±â:" +strAry.length);
			
			for(int i =0;i<strAry.length;i++)
			{
				System.out.println(strAry[i]);
			}
			
			int[] aAry = new int[5];
			int value=10;
			for(int i = 0;i<5;i++)
			{
				if (i!=0)
					aAry[i]=aAry[i-1]+value;
				else
					aAry[i]=value;
			}
			for(int i = 0;i<5;i++)
			{
				System.out.println(aAry[i]);
			}
			
			
	}
}

package hello;

public class MathExample {
	public static void main(String[] args) {
		int a=(int)(Math.random()*100);
		a= a/10;
	
//		if (a >=90)
//		{
//			System.out.println(a+" A���");
//		}
//		else if (a >=80)
//		{
//			System.out.println(a+" B���");
//		}
//		else if (a >=70)
//		{
//			System.out.println(a+" C���");
//		}
//		else if (a >=60)
//		{
//			System.out.println(a+" D���");
//		}
//		else
//		{
//			System.out.println(a+" F���");
//		}
		
		switch(a)
		{
		case 9:
			System.out.println(a+"A���");
			break;
		case 8:
			System.out.println(a+"B���");
			break;
		case 7:
			System.out.println(a+"C���");
			break;
		case 6:
			System.out.println(a+"D���");
			break;
		default:
			System.out.println(a+"F���");	
		}
		
		
		
	}

}

package hello;

public class CalendarTest {
	public static void main(String[] args) {
		showCal(9);
		
	
	}
	
	
	
	public static void showCal(int mon) {
		String[] week = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		
		int month = 8;
		int monthDay = getMonthday(month);
		int sDay = getStartday(month);
		System.out.println("          << "+mon+"월달 >>");
		for(String str :week)
		{
			System.out.print(" "+str);
		}
		
		System.out.println();

		//1일 위치 지정
		for(int i=1 ;i<sDay;i++)
		{
			System.out.printf("%4s", "");
		}
		
		for(int i=1 ;i<=monthDay;i++)
		{
			System.out.printf("%4d",i);
			
			if((sDay+i-1)%7 == 0)
				System.out.println();
		}
		
	}
	public static int getStartday(int month) {
		int startDay=0;
		if(month==9) {
			startDay =1;//일요일
		}
		else if (month == 10) {
			startDay =3;//화요일
		}
		else if (month == 11) {
			startDay =6;//금요일
		}
		else if (month == 8) {
			startDay =5;//목요일
		}
		return startDay;
	}
	
	public static int getMonthday(int a) {
		int allday=0;
		switch(a){
		case 1:allday=31; break;
		case 2:allday=28; break;
		case 3:allday=31; break;
		case 4:allday=30; break;
		case 5:allday=31; break;
		case 6:allday=30; break;
		case 7:allday=31; break;
		case 8:allday=31; break;
		case 9:allday=30; break;
		case 10:allday=31; break;
		case 11:allday=30; break;
		case 12:allday=31; break;
		default : 
		}
		
		return allday;
	}

}

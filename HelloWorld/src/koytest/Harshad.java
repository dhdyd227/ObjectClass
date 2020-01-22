package koytest;

public class Harshad {// ÀÚ¸´¼öÀÇ ÃÑÇÕ
	
	public static void main(String[] args) {
		int x =1234;
		boolean answer = true;
		double place;
		int sum = 0;
		int check=0;
		int value = x;
		place = Math.log10(x);

		for (int i = (int) place; i >= 0; i--) {
			if (value == 0)
				break;

			check=value / (int) (Math.pow(10, i));
			sum += value / (int) (Math.pow(10, i));

			value = value - (int) (Math.pow(10, i))*check;

		}
		System.out.println(sum);
//		if (x % sum == 0)
//			answer = true;
//		else
//			answer = false;

		
	}
	
}


package koytest;

public class Harshad2 {

	public static void main(String[] args) { //123 Ãâ·Â {3,2,1}
		int n = 321412521;

		int value = (int) n;
		int place = (int)Math.log10(n);
		int[] answer = new int[place + 1];

		for (int i = 0; i <=place; i++) {
			answer[i]=(int)(n%10);
			n/=10;

		}
		
		for(int k : answer) {
			System.out.printf("%d ",k);
		}
	}

}

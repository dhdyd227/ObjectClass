package koytest;

public class UpperAlpha {//소문자,대문자를 3단계위 (a->d)
	public static void main(String[] args)
	{
		System.out.println(solution("a b c D",3));
	}
	
	public static String solution(String s, int n) {
		String answer = "";
		char[] a = s.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == (char) 32) {
				answer += a[i];
			} else if (((90 >= a[i]) && (a[i] >= 65)) == true) {
				a[i] = (char) (a[i] + n);
				if (a[i] > 90) {
					a[i] = (char) (64 + a[i] - 90);
				}
				answer += a[i];
			} else {
				a[i] = (char) (a[i] + n);
				if (a[i] > 122)
					a[i] = (char) (96 + a[i] - 122);

				answer += a[i];
			}

		}
		System.out.println(answer);

		return answer;
	}
	
}
package hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int[] randomNumber = new int[3];
		int radomNumberSize = randomNumber.length;
		
		for (int i = 0; i < radomNumberSize; i++) {
			randomNumber[i] = (int) (Math.random() * 9)+1; //1~9
			for(int j=0;j<i;j++) {
				if(randomNumber[i] == randomNumber[j]) {  //중복된 숫자 선언된거 제거하는 조건
					System.out.println(randomNumber[i]+""+randomNumber[j]);
					i-=1;
					break;
				}
			}
		}

		for (int i = 0; i < radomNumberSize; i++) {
			System.out.print(randomNumber[i] + " ");
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);

		int[] user = new int[3];
		int userSize = user.length;

		boolean run = true;

		while (run) {
			System.out.print("first: ");
			user[0] = sc.nextInt();

			System.out.print("second: ");
			user[1] = sc.nextInt();

			System.out.print("third: ");
			user[2] = sc.nextInt();

			int strike = 0;
			int ball = 0;
			int runcheck = 0;

			if (runcheck == 0) {
				int usercheck = 0;

				for (int i = 0; i < userSize; i++) {
					if (usercheck == 0)
						for (int j = (i + 1); j < userSize; j++) {
							if (user[i] == user[j] && usercheck == 0) {
								System.out.println("재입력하세요");
								usercheck = 1;
								runcheck = 1;
							}
						}
				}
			}
			
			if (runcheck == 0) {
				for (int i = 0; i < radomNumberSize; i++) {
					for (int j = 0; j < userSize; j++) {
						if (randomNumber[i] == user[j]) {
							if (i == j) {
								strike++;
							} else {
								ball++;
							}

						}
					}
				}

				System.out.println("strike= " + strike + "  ball= " + ball);

				if (strike == radomNumberSize) {
					System.out.println("정답입니다~");
					run = false;
				}
			}
		}

	}

}

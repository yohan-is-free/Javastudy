package Question1_31;

import java.util.Scanner;

public class jaFe_05 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 최대공약수 & 최소공배수를 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1 입력 >> ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2 입력 >> ");
		int num2 = sc.nextInt();
		int min = 0;
		int max = 0;

		for (int i = 2; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}

		}
		min = num1 * num2 / max;
		
		System.out.println("최대 공약수 : " + max);
		System.out.println("최소 공배수 : " + min);

	}

}

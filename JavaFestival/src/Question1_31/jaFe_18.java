package Question1_31;

import java.util.Scanner;

public class jaFe_18 {

	// 정수를 입력받아 입력받은 수까지의 총합을 출력하시오

	public static void cal(int num1) {
		int sum = 0;
		for (int i = 1; i <= num1; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num1 + "까지의 합은 " + sum + "입니다.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		cal(sc.nextInt());

	}

}

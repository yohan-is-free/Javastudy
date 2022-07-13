package Question1_31;

import java.util.Scanner;

public class jaFe_01 {

	public static void main(String[] args) {
		// 정수를 입력받아 십의자리 이하를 버리는 코드를 작성

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.print("결과 : ");
		System.out.print(num - (num % 100));

	}

}

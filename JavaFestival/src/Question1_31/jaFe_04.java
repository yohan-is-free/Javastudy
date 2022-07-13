package Question1_31;

import java.util.Scanner;

public class jaFe_04 {

	public static void main(String[] args) {
		// 세 자리 수 * 세자리 수
		// (1),(2)번을 입력 받아 (3),(4),(5),(6)번을 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int b = sc.nextInt();

		int sum1 = a * (b % 10);
		int sum2 = a * (b % 100 / 10);
		int sum3 = a * (b / 100);
		int sum4 = a * b;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		sc.close();

	}

}

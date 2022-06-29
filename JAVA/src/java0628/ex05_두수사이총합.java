package java0628;

import java.util.Scanner;

public class ex05_두수사이총합 {

	public static void main(String[] args) {
		// 스캐너 클래스를 사용해 숫자 2개를 입력받아
		// 두 수 사이의 총 합을 출력

		Scanner sc = new Scanner(System.in);
		int sum = 0; // 누적합이 담길 변수

		System.out.print("첫 번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println("두 수의 총합 = " + sum);

	}

}

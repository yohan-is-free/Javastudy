package java0628;

import java.util.Scanner;

public class ex04_100이하두개정수 {

	public static void main(String[] args) {
		// 100 이하의 두 개의 정수를 입력 받아
		// 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오

		Scanner sc = new Scanner(System.in);
		int i = 0, a = 0;

		System.out.println("===정수 두 개를 입력하세요===");
		i = sc.nextInt();
		a = sc.nextInt();

		if (i > a) {
			for (; i >= a; a++) {
				System.out.println("" + a);
			}
		} else if (a > i) {
			for (; a >= i; i++) {
				System.out.println("" + i);
			}
		}

	}

}

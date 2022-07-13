package Question1_31;

import java.util.Scanner;

public class jaFe_07 {

	public static void main(String[] args) {
		// 행 개수를 입력 받아 별찍기 삼각형을 출력하시오

		Scanner sc = new Scanner(System.in);
		int a = 1;
		System.out.print("행 개수 : ");
		int n = sc.nextInt();
		int cnt = 0;
		while (n > 0) {

			for (a = n; a > 0; a--) {
				System.out.print("*");
				continue;
			}
			System.out.println(" ");
			n--;

		}

	}
}

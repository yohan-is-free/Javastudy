package Question1_31;

import java.util.Scanner;

public class jaFe_13 {

	public static void main(String[] args) {
		// 1부터 입력받은 수 까지의 약수를 모두 구하시오

		Scanner sc = new Scanner(System.in);

		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {

			System.out.print(j + " : ");
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					System.out.print(i + " ");
				}

			}
			System.out.println();

		}

	}

}

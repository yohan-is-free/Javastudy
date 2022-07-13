package Question1_31;

import java.util.Scanner;

public class jaFe_06 {

	public static void main(String[] args) {
		// 8자리 정수를 입력받아 반복문을 활용하여
		// 입력받은 정수의 합을 구하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int result = n;
		int sum = 0;

		while(result >0) {
			sum += result % 10;
			result = result/10;
		}
		System.out.println("합은 " + sum + "입니다.");

	}

}

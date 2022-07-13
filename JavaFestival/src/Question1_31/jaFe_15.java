package Question1_31;

import java.util.Scanner;

public class jaFe_15 {

	public static int[] change(int money) {
		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력
		// 단, 최대단위는 10000원, 최소는 100원

		int[] list = new int[5];

		list[0] = money / 10000;
		list[1] = (money % 10000) / 5000;
		list[2] = (money % 10000 % 5000) / 1000;
		list[3] = (money % 10000 % 5000 % 1000) / 500;
		list[4] = (money % 10000 % 5000 % 1000 % 500) / 100;
		return list;
	}

	public static void print(int[] list) {
		System.out.println("잔돈 변환");
		System.out.println("10000원 : " + list[0] + "개");
		System.out.println("5000원 : " + list[1] + "개");
		System.out.println("1000원 : " + list[2] + "개");
		System.out.println("500원 : " + list[3] + "개");
		System.out.println("100원 : " + list[4] + "개");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재 금액 : ");
		print(change(sc.nextInt()));
	}

}

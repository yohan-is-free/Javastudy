package java0627;

import java.util.Scanner;

public class ex01_자판기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 돈 입력
		int money, choice, change = 0;
		int coke = 800;
		int water = 500;
		int vitamin = 1500;
		int thousandWon, obaekWon, baekWon = 0;

		System.out.println("금액을 입력하세요.");
		money = sc.nextInt();

		// 메뉴 입력
		System.out.println("메뉴를 고르세요!!");
		System.out.print("1.콜라(800원) / 2.생수(500원) / 3.비타민워터(1500원) >> ");
		choice = sc.nextInt();

		// 잔돈 계산
		if (choice == 1 && money > coke) {
			change = money - coke;
		} else if (choice == 2 && money > water) {
			change = money - water;
		} else if (choice == 3 && money > vitamin) {
			change = money - vitamin;
		} else {
			change = money;
			System.out.println("돈이 부족합니다!");
		}

		System.out.println("잔돈 : " + change + "원");

		// 잔돈 부족 출력
		thousandWon = change / 1000;
		obaekWon = change % 1000 / 500;
		baekWon = change % 1000 % 500 / 100;
		System.out.println("천원 : " + thousandWon + "개," + " 오백원 : " + obaekWon + "개," + " 백원 : " + baekWon + "개");

	}

}

package Question1_31;

import java.util.Scanner;

public class jaFe_22 {

	public static void main(String[] args) {

		// 다이어트 프로그램
		// 현재 몸무게와 목표 몸무게를 입력 후
		// 반복문을 활용하여 주차 별 목표 몸무게에 도달할때까지 몸무게를 감소
		// 목표몸무게에 달성하게 되면 프로그램을 종료

		System.out.println("----다이어트 프로그램----");
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게를 입력하시오 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int goal = sc.nextInt();

		int cnt = 1, lose = 0;
		while (now > goal) {
			System.out.print(cnt + "주차 감량 몸무게 입력 : ");
			lose = sc.nextInt();
			now -= lose;
			if (now <= goal) {
				System.out.println(cnt + "주차 다이어트 성공!!");
				break;
			}
			cnt++;
		}

	}

}

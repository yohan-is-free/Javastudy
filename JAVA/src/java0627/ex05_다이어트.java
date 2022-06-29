package java0627;

import java.util.Scanner;

public class ex05_다이어트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();  // 현재 몸무게
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();  // 목표 몸무게

		int cnt = 1;  // ~주차 카운트 변수
		int weight = 0;  // 점차 감소하는 몸무게 변수
		
		while (now > goal) {  // 현재 몸무게가 목표몸무게 보다 큰 경우
			System.out.print(cnt + "주차 감량 몸무게 : ");
			weight = sc.nextInt();
			cnt++;
			now -= weight;  // 현재 몸무게에서 입력하여 감량한 몸무게 만큼 빼기
		}
		System.out.println(now + "kg 달성! 축하합니다!!");
	}

}

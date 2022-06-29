package java0627;

import java.util.Scanner;

public class ex04_성적합계와평균 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int num = 0, sum = 0;
//		double cnt = 0;
//		while(true) {
//			System.out.print("숫자를 입력하세요 : ");		
//			num = sc.nextInt();
//			if(num>100 || num < 0){
//				break;
//			}else {
//				sum += num;
//				cnt++;;
//			}
//		}
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+(sum/cnt));

		// 쌤 풀이 (do-while문)
		int score = 0;
		int sum = 0; // 누적합 변수
		double cnt = -1; // 카운팅 변수
		do {
			System.out.println("숫자 입력 : ");
			score = sc.nextInt();
			sum += score; // 누적합 알고리즘
			cnt++; // 성적입력 횟수를 카운팅
		} while (score >= 0 && score <= 100);

		System.out.println("합계 : " + (sum - score));
		System.out.println("평균 : " + ((sum - score) / cnt));

	}

}

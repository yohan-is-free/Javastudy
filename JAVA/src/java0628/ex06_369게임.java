package java0628;

import java.util.Scanner;

public class ex06_369게임 {

	public static void main(String[] args) {
		// 1~50까지 369게임을 출력
		// - 끝자리 수가 3,6,9일 때는 "박수" 출력
		// - 끝자리 수가 5일 때는 "으악"을 출력
		// - 그 외의 나머지 수는 그냥 숫자를 출력
		
//		for(int i=1;i<=50;i++) {
//			switch(i%10) {
//			case 3:
//			case 6:
//			case 9:
//				System.out.println("박수");
//				break;
//			case 5:
//				System.out.println("으악");
//				break;
//			default:
//				System.out.println(i);
//			}
//		}
		
		// 쌤 풀이
		for(int i =1; i<=50; i++) {
			if(i%10==3 || i%10==6 || i%10==9) {
				System.out.println("박수");				
			}else if(i%10==5) {
				System.out.println("으악");
			}else {
				System.out.println(i);
			}
		}

	}

}

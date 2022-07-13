package Question1_31;

import java.util.Scanner;

public class jaFe_11 {

	public static void main(String[] args) {
		// 시험 합격여부를 알려주는 프로그램
		// 합격기준 : 총 점수의 합이 60개 이상 &
		// 과목당 8개 이상 맞아야 합격 (과목 당 최대점수 20점)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.소프트웨어 설계 >> ");
		int sub1 = sc.nextInt();
		System.out.print("2.소프트웨어 개발 >> ");
		int sub2 = sc.nextInt();
		System.out.print("3.데이터베이스 구축 >> ");
		int sub3 = sc.nextInt();
		System.out.print("4.프로그래밍 언어 활용 >> ");
		int sub4 = sc.nextInt();
		System.out.print("5.정보시스템 구축관리 >> ");
		int sub5 = sc.nextInt();
		
		int hap = sub1+ sub2 + sub3 + sub4 + sub5;
		
		if(hap>=60 && sub1 >=8 && sub2 >=8 && sub3 >=8 && sub4 >=8 && sub5 >=8) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("탈락입니다...");
		}

	}

}

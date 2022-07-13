package Question1_31;

import java.util.Scanner;

public class jaFe_20 {

	public static void main(String[] args) {
		
		// 1차원 배열을 이용하여 학생의 점수를 입력받아
		// 총점과 평균을 저장하고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 점수 : ");
		int java = sc.nextInt();
		System.out.print("Web 점수 : ");
		int web = sc.nextInt();
		System.out.print("And 점수 : ");
		int and = sc.nextInt();
		
		int sum = 0, avg = 0;
		int[] score = new int[3];
		score[0] = java;
		score[1] = web;
		score[2] = and;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum/3;
		
		System.out.println("Java : "+score[0]);
		System.out.println("Web : "+score[1]);
		System.out.println("And : "+score[2]);
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
	}

}

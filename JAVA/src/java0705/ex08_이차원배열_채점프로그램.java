package java0705;

import java.util.Scanner;

public class ex08_이차원배열_채점프로그램 {

	public static void main(String[] args) {
		// 3행 5열 배열 answer을 만들고 초기화
		// 값을 입력 받아 2번째 행에 저장하고 맞으면 O, 틀리면 X를 출력p
		// 총점까지 출력
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[5]; // 입력한 정답이 들어가는 배열
		int[] answer = {4,5,4,1,2}; // 정답 배열
		arr[1] = answer;
		int[] score = {10,20,30,20,20}; // 각 항목 배점 배열
		arr[2] = answer;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for(int i=0;i<=4;i++) {
			System.out.print((i+1)+"번답 >> ");
			arr[0][i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < arr[1].length; i++) {
			if(arr[0][i]==arr[1][i]) {
				System.out.print("O ");
				sum += arr[2][i];
			}else {
				System.out.print("X ");
			}
		}
		
		System.out.println("총점 : "+sum);

	}

}

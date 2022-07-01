package java0701;

import java.util.Scanner;

public class ex06_채점프로그램심화 {

	public static void main(String[] args) {
		
		int[] input = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요 => ");
		
		for(int i=1; i<=input.length; i++) {
			System.out.print(i+"번 답 >> ");
			input[i-1] = sc.nextInt();
		}
		
		int[] ans = {1,4,3,2,1};
		int[] point = {15, 25, 30, 20, 10};
		int sum = 0;
		
		System.out.println("정답확인");
		for(int j=1; j<=input.length; j++) {
			if(input[j-1] != ans[j-1]) {
				System.out.print("X"+" ");
			}else if(input[j-1] == ans[j-1]) {
				System.out.print("O"+" ");
				sum+=point[j-1];
			}	
		}
		System.out.println(" 총 점 : "+sum);
		
	}

}

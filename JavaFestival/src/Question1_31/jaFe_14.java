package Question1_31;

import java.util.Scanner;

public class jaFe_14 {

	public static void main(String[] args) {
		// 정수 N을 입력받아 N*N 배열에 다음과 같이 숫자를 저장하고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 N을 입력해 주세요 : ");
		int N = sc.nextInt();
		
		int[][] list = new int[N][N];
		int cnt = 1;
		
		for(int i=0; i < list.length; i++) {			
			for(int j=0; j < list.length; j++) {
				list[j][i] = cnt;
				cnt++;				
			}
		}
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list.length; j++) {
				System.out.print(list[i][j]+"\t");
			}
			System.out.println();
		}

	}

}

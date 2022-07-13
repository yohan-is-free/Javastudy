package Question1_31;

import java.util.Scanner;

public class jaFe_30 {

	public static void main(String[] args) {
		// 정수 N을 입력받아 N*N 배열에 다음과 같이 숫자를 저장하고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		int num = sc.nextInt();
		int[][] matrix = new int[num][num];
		
		int fillNum = 1;
		for (int i = 0; i < num; i++) {
			if (i%2 == 0) {
				for (int j = 0; j < num; j++) {
					matrix[i][j] = fillNum++;
				}
			} else {
				for (int j = num -1 ; j >= 0; j--) {
					matrix[i][j] = fillNum++;
				}
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.printf("%d\t",matrix[i][j]);
			}
			System.out.println();
		}
		sc.close();

	}

}

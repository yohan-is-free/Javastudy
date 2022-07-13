package Question1_31;

import java.util.Scanner;

public class jaFe_27 {

	public static void main(String[] args) {
		// 각 배열의 인덱스에 값을 입력받고
		// 인덱스의 수만큼 별을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%d 번째 입력 : ",i);
			arr[i-1] = sc.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d : ",arr[i]);
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}

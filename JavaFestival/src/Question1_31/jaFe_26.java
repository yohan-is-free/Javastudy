package Question1_31;

import java.util.Scanner;

public class jaFe_26 {

	public static void myArr(int var) {
		// 정수 n을 입력받아 1,2,4,7,11과 같은 수열의
		// n번째 항까지 출력하시오

		int init = 1;
		for(int i = 0; i < var; i++) {
			init += i;
			System.out.print(init+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int var = sc.nextInt();
		myArr(var);
		sc.close();
		
	}

}

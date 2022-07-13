package Question1_31;

import java.util.Scanner;

public class jaFe_10 {

	public static void main(String[] args) {
		// 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();
		
		int up = num%10;
		int result = 0;
		
		if(up<5) {
			result = num - up;
		}else if(up>5) {
			result = num + (10-up);
		}else {
			result = num;
		}
		
		System.out.println("반올림 후 값 : " + result);

	}

}

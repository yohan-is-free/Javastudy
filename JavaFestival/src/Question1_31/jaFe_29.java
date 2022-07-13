package Question1_31;

import java.util.Scanner;

public class jaFe_29 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아 2진수로 변환해서 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		
		String binaryNum = "";
		while (num > 0) {
			binaryNum = num%2 + " " + binaryNum;
			num /= 2;
		}
		sc.close();
		System.out.println(binaryNum);

	}

}

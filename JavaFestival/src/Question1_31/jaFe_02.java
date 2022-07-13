package Question1_31;

import java.util.Scanner;

public class jaFe_02 {

	public static void main(String[] args) {
		// 윤년을 구하는 프로그램
		// 윤년이랑 2월29일이 있는 날
		// 4의 배수이면서 100의 배수가 아닐 때는 윤년이다
		// 400의 배수일 때 윤년이다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 >> ");
		int year = sc.nextInt();
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년아님");
		}

	}

}

package Question1_31;

import java.util.Scanner;

public class jaFe_24 {

	public static void main(String[] args) {
		
		// 소인수 분해를 해주는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요 : ");
		int num = sc.nextInt();
		int i = 2;
		
		System.out.print(num+" = ");
		while(num!=1) {
			if(num%i==0) {
				System.out.print(i);
				num/=i;
				if(num>i) {
					System.out.print("*");
				}else {
					break;
				}
			}else {
				i++;
			}
		}
		
	}

}

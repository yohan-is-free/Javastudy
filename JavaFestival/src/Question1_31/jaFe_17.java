package Question1_31;

import java.util.Scanner;

public class jaFe_17 {

	// 마트 계산대 프로그램
	// 10000원짜리 선물을 구입했을 때 지불해야하는 금액을
	// 계산해주는 프로그램을 작성
	// 단, 11개 이상 구매시 10% 할인 적용

	private static int price = 10000;
	
	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		price = price;
	}

	public static int buy(int num1) {
		if (num1 > 10) {
			return (int) (getPrice() * num1 * 0.9);
		} else {
			return getPrice() * num1;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("사려는 상품개수를 입력하세요 >> ");
		System.out.println("가격은 " + buy(sc.nextInt()) + "원 입니다.");

	}

}

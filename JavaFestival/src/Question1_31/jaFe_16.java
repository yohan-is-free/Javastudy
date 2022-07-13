package Question1_31;

public class jaFe_16 {

	public static void getPerfectNumber(int num1, int num2) {
		// startValue부터 endValue까지의 숫자 중 완전수를 출력하는
		// getPerfectNumber() 메소드를 구현하세요

		System.out.print(num1 + "~" + num2 + "까지의 완전수 : ");
		while (num1 <= num2) {
			int i = 1;
			int sum = 0;
			while (i < num1) {
				if (num1 % i == 0) {
					sum += i;
				}
				i++;
			}
			if (sum == num1) {
				System.out.print(num1 + " ");
			}
			num1++;
		}
	}

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

}

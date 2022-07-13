package Question1_31;

public class jaFe_25 {

	public static void main(String[] args) {

		// 정수형 변수 input을 선언하고
		// 피보나치 수열의 input번째 항까지 출력하시오

		int input = 8;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
	public static int fibo(int num) {
		
		if (num <= 1) {
			return num;
		} else {
			return fibo(num - 2) + fibo(num - 1);
		}
	}
}

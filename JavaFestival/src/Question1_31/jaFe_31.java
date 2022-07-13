package Question1_31;

public class jaFe_31 {

	// num1, num2, op(+, -, *, /)를 매개변수로 받아
	// num1과 num2를 op에 맞게 연산한 결과값을 반환해주는
	// cal 메소드를 작성

	public static int cal(int num1, int num2, String op) {

		int result = 0;
		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		String op1 = "+";
		String op2 = "-";
		String op3 = "*";
		String op4 = "/";

		System.out.println(cal(num1, num2, op1));
		System.out.println(cal(num1, num2, op2));
		System.out.println(cal(num1, num2, op3));
		System.out.println(cal(num1, num2, op4));

	}

}

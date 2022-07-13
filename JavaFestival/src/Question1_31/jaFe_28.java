package Question1_31;

import java.util.Random;

public class jaFe_28 {

	public static void main(String[] args) {
		// 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오

		Random rd = new Random();
		int[] arr = new int[6];

		arr[0] = rd.nextInt(45) + 1;
		for (int i = 1; i < 6; i++) {
			arr[i] = rd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("행웃의 숫자 : " + arr[i]);
		}

	}

}

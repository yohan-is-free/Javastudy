package java0629;

public class ex03_뒤집어별찍기 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
		for (int j = 0; j < i + 1; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}

package java0705;

public class ex07_이차원배열21에서45 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int cnt = 21;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		// 행 인덱스를 제어
		for (int i = 0; i < arr.length; i++) {
			// 열 인덱스를 제어
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();

		}

	}
}

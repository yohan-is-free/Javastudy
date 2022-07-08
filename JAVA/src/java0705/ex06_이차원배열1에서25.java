package java0705;

public class ex06_이차원배열1에서25 {

	public static void main(String[] args) {
		// 5행 5열 크기의 2차원 배열 arr를 선언하고 1~25까지 초기화
		// ex) arr[0][0] = 1;  arr[4][4] = 25;
		
		int[][] arr = new int[5][5];  // 5x5 정수형 이차원배열
		int n = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}	
		}
		// 행 인덱스를 제어
		for(int i=0; i<arr.length; i++) {
			// 열 인덱스를 제어
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}

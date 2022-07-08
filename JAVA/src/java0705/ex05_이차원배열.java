package java0705;

public class ex05_이차원배열 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][2];
		
		System.out.println(arr);
		System.out.println(arr.length);
		
		// 0번째 1차원배열 접근
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		// 1번째 1차원배열 접근
		arr[1][0] = 3;
		arr[1][1] = 4;

		// 1번째 1차원배열 접근
		arr[2][0] = 5;
		arr[2][1] = 6;
		
		// 공간선언과 초기화를 동시에
		int[][] arr2 = {{1,2},{3,4},{5,6}};
		
		System.out.println(arr2.length);  // 행의 길이
		System.out.println(arr2[0].length);  // 열의 길이
		System.out.println(arr2[0][1]);  
	}

}

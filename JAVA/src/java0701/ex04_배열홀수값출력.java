package java0701;

public class ex04_배열홀수값출력 {

	public static void main(String[] args) {
		// 1차원 정수형 배열을 선언한 후 임의의 값으로 초기화 합니다
		// 배열의 값 중 홀수인 값이 몇 개인지 출력하는 프로그램을 작성하세요
		
		int cnt = 0;
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.print("array에 들어있는 홀수는 ");
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] % 2 ==1) {
				System.out.print(arr[i]+" ");
				cnt++;
			}
		}
		System.out.println("이며, 총 "+cnt+"개 입니다");
	}

}

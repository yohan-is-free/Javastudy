package java0628;

public class ex02_홀수출력 {

	public static void main(String[] args) {
		
		// for문 이용, 25~70 홀수만 출력
		for(int i=25; i<=70; i++) {
			if(i%2==1){  // 홀수 출력
				System.out.println(i);
			}
		}
		
//		for(int i=25;i<=70;i+=2) {
//			System.out.println(i);
//		}

	}

}

package java0630;

public class ex01_1에서100 {

	public static void main(String[] args) {
		// for문을 사용하여 1에서 100까지 다음과 같은 순서로 출력하세요
		
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}else if(i%2==0) {
				System.out.print("-"+i+" ");
			}
			
		}

	}

}

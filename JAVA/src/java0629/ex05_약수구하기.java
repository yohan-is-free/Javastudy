package java0629;

public class ex05_약수구하기 {

	public static void main(String[] args) {

		// 2~30까지의 약수를 구하세요
		
		for (int i = 1; i <= 30; i++) {
			System.out.print(i+"의 약수 : ");
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}
}

package java0714;

public class ex_Basic19 {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 780;
		int v = evenHap(a, b);
		System.out.println(v);

	}
	// 매개변수로 2개의 정수를 받아서 두 수 사이의 짝수의 합을 구하여 리턴하는 메소드를 정의하시오 (evenHap)
	// 인스턴스 메소드, 클래스 메소드(static)
	public static int evenHap(int a, int j) {
		int even = 0;
		for (int i=a; i<=j; i++) {
			if(i%2==0) {
				even+=i;
			}
		}
		return even;
	}
	
}
/*
 class = Model(역할이 정해진 것)의 종류 
  1. DTO, VO : 데이터 타입(바구니, 이동)
  2. DAO(Data Access Object) : 비즈니스 로직을 처리하는 역할(DB연동)
  3. Utility : 도움을 주는 역할(인코딩, 날짜, 통화, 시간...)
  
 */
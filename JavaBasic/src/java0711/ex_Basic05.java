package java0711;

public class ex_Basic05 {

	public static void main(String[] args) {
		
		// 1~10까지의 총 합은?
		hap();  // 메서드 호출(call)
		System.out.println("종료");

	}
	// 1~10까지의 총합을 구하는 hap()이라는 메서드를 정의하시오
	public static void hap(){
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}

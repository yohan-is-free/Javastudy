package java0628;

public class ex08_구구단가로 {

	public static void main(String[] args) {
		// 구구단 가로로 2~9단까지 출력
		int cnt = 2;
		for(int i = 2; i<10; i++) {
			System.out.print(cnt+"단: ");
			for(int j=1; j<10; j++) {
				System.out.print(i+"*"+j+"=" + i*j+"\t");
			}
			System.out.println();
			cnt++;
		}

	}

}

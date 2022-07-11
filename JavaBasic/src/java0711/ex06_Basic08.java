package java0711;

public class ex06_Basic08 {

	public static void main(String[] args) {
		int[] a = makeArr();
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);

	}
	// 5개가 저장된 정수형 배열을 만들어서 리턴하시오
	public static int[] makeArr() {
		int[] a = {5,4,3,2,1};
		return a;
	}

}

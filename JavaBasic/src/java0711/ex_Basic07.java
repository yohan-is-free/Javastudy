package java0711;

public class ex_Basic07 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5};
		// a배열의 총합을 구하시오
		int v = arrHap(a);
		System.out.println(v);

	}
	// 매개변수로 정수형 배열을 받아서 총합을 구하여 리턴하는
	// 메소드를 정의하시오 (arrHap)
	public static int arrHap(int[] a){
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	
	}

}

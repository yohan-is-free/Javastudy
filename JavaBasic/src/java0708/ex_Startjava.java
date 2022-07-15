package java0708;

public class ex_Startjava {

	public static void main(String[] args) {
		
		// 변수, DataType(자료형), 할당(=)
		// 회원 1개를 저장할 [변수를 선언]하시오
		int a;
		a=10;
		System.out.println(a);
		
		// 정수 3개를 저장할 [변수를 선언]하시오
		int[] arr = new int[3];  // 정수형 배열 선언
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		// 총 합?
		int tot=0; // 10+20+30=60
		for(int i=0; i<arr.length; i++) {
			tot=tot+arr[i];
			System.out.println(tot);
		}
		

	}

}

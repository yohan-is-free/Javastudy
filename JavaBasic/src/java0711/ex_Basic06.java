package java0711;

public class ex_Basic06 {

	public static void main(String[] args) {
		int x = 100;
		int y = 300; 
		// x+y=?
		int sum = hap(x, y); // 호출하는 쪽(x,y)
		System.out.println(sum);

	}
	// 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는
	// 메서드를 정의하시오 (hap)
	public static int hap(int a, int b){
		int v= a+b;
		return v;
	}
	

}

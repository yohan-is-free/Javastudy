package java0714;

public class myUtil {
	
	private myUtil(){
		
	}
	// 메소드의 오버로딩(overloading)
	// 메소드의 시그니처(개수, 자료형)
	// 정적바인딩(컴파일 시점에서 사용될 메소드가 연결됨, 속도무관)
	public static int hap(int a, int b) {
		return a+b;
	}
	public static float hap(float a, float b) {
		return a+b;
	}
	
	
}

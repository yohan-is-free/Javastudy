package java0713;

public class ex_Basic14 {

	public static void main(String[] args) {
		// 객체가 생성되는 메모리공간(heap memory)
		String a = new String("ABC");
		String b = new String("DEF");
		// 문자열의 대소 비교(정렬)
		int cmp = a.compareTo(b);
		if(cmp>0) {
			System.out.println("a>b");
		}else if(cmp<0){
			System.out.println("a<b");
		}else {
			System.out.println("a==b");
		}
		
		// 문자열이 같은지 다른지
		if(a.equals(b)) {
			System.out.println("a==b");
		}else {
			System.out.println("a!=b");
		}
		//----------------------------------------
		int    su=10;
		
		// 리터럴(문자열상수) : Literal POOL(memory)
		String x="ABC";  // 리터럴(문자열상수)
		String y="ABC";  
		if(x.equals(y)) {
			System.out.println("x==y");
		}else {
			System.out.println("x!=y");
		}

	}

}

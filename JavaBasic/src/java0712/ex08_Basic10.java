package java0712;

public class ex08_Basic10 {

	public static void main(String[] args) {
		
		// 책 1권을 저장할 객체를 생성하시오
		int a=0; // 지역변수는 사용전에 초기화 할 것
		Book b1 = new Book("자바", "홍길동", "영진", 30000, 820);
		Book b2 = new Book("오라클", "박길동", "샘물", 32000, 810);
		Book b3 = new Book("C++", "김길동", "시련", 29000, 720);
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		
		// 책 3권을 저장할 변수를 선언하시오
		// 객체배열 (Object 배열)
		Book[] arr = new Book[3];
		arr[0] = new Book("자바", "홍길동", "영진", 30000, 820);
		arr[1] = new Book("오라클", "박길동", "샘물", 32000, 810);
		arr[2] = new Book("C++", "김길동", "시련", 29000, 720);
		for(Book b:arr) {
			System.out.println(b);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

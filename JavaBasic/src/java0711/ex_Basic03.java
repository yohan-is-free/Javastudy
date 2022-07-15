package java0711;

public class ex_Basic03 {
	// 메서드(Method), 함수(Function) => 동작(행위정보)
	
	public static void main(String[] args) {
		// 변수 -> 배열 -> 객체(클래스)
		
		//정수 1개를 저장할 변수를 선언하고 그 변수에 10을 할당
		int a =10;
		if(a%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		// 정수 3개를 저장할 변수를 선언하고, 10,20,30을 저장
		int[] arr= {10,20,30};
		
		// 책 1권을 저장할 변수를 선언
		// class : 새로운 자료형을 만드는 도구
		// Book b;
		// 객체를 생성(Book) : 객체를 생성하는 메서드(생성자 메서드)
		Book b = new Book();
		b.title="명품자바";
		b.name="황기태";
		b.company="생능 출판사";
		b.price=33000;
		b.page=851;
		
		System.out.print(b.title+" ");
		System.out.print(b.name+" ");
		System.out.print(b.company+" ");
		System.out.print(b.price+" ");
		System.out.println(b.page+" ");
	}

}

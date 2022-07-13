package java0712;

public class ex09_Basic11 {

	public static void main(String[] args) {
		
		// 책 1권의 데이터를 표현
		// 키보드로부터 책 데이터를 입력
		String title = "자바";
		String name = "안요한";
		String company = "삼성";
		int price = 150000;
		int page = 500;
		
		// 묶어주는 도구(배열, 새로운 바구니)
		Book b = new Book(title, name, company, price, page);
		
		// bookPrint() 메소드에서 책 데이터를 출력하시오
		bookPrint(b);  // call by reference

	}
	public static void bookPrint(Book b) {
		System.out.println(b);
	}

}

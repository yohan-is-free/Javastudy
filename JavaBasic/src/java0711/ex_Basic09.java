package java0711;

public class ex_Basic09 {

	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.title="자바";
		b.name="황기태";
		b.company="생능";
		b.price=35000;
		b.page=851;
		
		printBook(b);

	}
	// 책 1권을 매개변수로 받아서 출력하는 메서드를 정의하시오
	// printBook()
	public static void printBook(Book b) {
		
		System.out.print(b.title+"|");
		System.out.print(b.name+"|");
		System.out.print(b.company+"|");
		System.out.print(b.price+"|");
		System.out.println(b.page+"|");
		
	}

}

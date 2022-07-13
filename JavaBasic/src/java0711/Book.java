package java0711;

public class Book {
	String title;
	String name;
	String company;
	int price;
	int page;
	// 디폴트 생성자 메서드
	// 1. 리턴타입이 없다
	// 2. 메서드 이름이 클래스 이름과 동일하다
	
	public Book() {
	// 3. 객체를 생성(memory)하는 일	
	// 4. 객체의 초기화(*)
		this.title="자바";
		this.name="홍길동";
		this.price=30000;
		this.company="영진";
		this.page=800;
	}
	// 모든 멤버변수의 값을 리턴하는 메서들 정즤하시오
	public String toString(){
		return title+"|"+name+"|"+price+"|"+company+"|"+page;
	}
}

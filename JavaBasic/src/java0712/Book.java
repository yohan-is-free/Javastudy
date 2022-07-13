package java0712;

public class Book {
	private String title;
	private String name;
	private String company;
	private int price;
	private int page;
	// 디폴트 생성자 메서드
	// 1. 리턴타입이 없다
	// 2. 메서드 이름이 클래스 이름과 동일하다
	
	// 생성자 메소드의 오버로딩 = 중복정의
	public Book(String title, String name, String company, int price, int page) {
		super();
		this.title = title;
		this.name = name;
		this.company = company;
		this.price = price;
		this.page = page;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}


	// 모든 멤버변수의 값을 리턴하는 메서들 정의하시오
	@Override
	public String toString() {
		return "Book [title=" + title + ", name=" + name + ", company=" + company + ", price=" + price + ", page="
				+ page + "]";
	}
	
}

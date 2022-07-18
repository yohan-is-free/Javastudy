package java0714;

public class MovieVO {

	String name, hero, theater, time;
	int price;
	public MovieVO(String name, String hero, int price, String time, String theater) {
		super();
		this.name = name;
		this.hero = hero;
		this.theater = theater;
		this.time = time;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MovieVO [name=" + name + ", hero=" + hero + ", theater=" + theater + ", time=" + time + ", price="
				+ price + "]";
	}
	
	
	
}

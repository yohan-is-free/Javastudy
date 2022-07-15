package java0712;

public class ex_Basic12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieVO[] arr=new MovieVO[3];
		arr[0] = new MovieVO("범죄도시","마동석","CGV","18:30",13000);
		arr[1] = new MovieVO("신과함께","하정우","CGV","20:40",18000);
		arr[2] = new MovieVO("마블-엔드게임","아이언맨","CGV","13:15",10000);
		
		for(MovieVO m:arr) {
			System.out.println(m);
		}
		
	}

}

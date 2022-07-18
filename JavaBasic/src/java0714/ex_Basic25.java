package java0714;

import com.google.gson.Gson;

public class ex_Basic25 {

	public static void main(String[] args) {

		// 데이터 포멧(XML, JSON) = 데이터를 표현하는 방법
		MovieVO m = new MovieVO("범죄도시", "홍길동", 15000, "CGV", "1:50");
		Gson g = new Gson();
		String s = g.toJson(m);
		System.out.println(s);
		makeObject(s);

		MovieVO[] m1 = new MovieVO[3];
		m1[0] = new MovieVO("범죄도시", "홍길동", 15000, "CGV", "1:50");
		m1[1] = new MovieVO("탑건", "홍길동", 15000, "CGV", "1:50");
		m1[2] = new MovieVO("마녀", "홍길동", 15000, "CGV", "1:50");
		String s1 = g.toJson(m1);
		System.out.println(s1);
		makeArray(s1);
	}

	// JSON문자열을 Object로 변경 메서드를 정의
	public static void makeObject(String json) {
		Gson g = new Gson();
		MovieVO m = g.fromJson(json, MovieVO.class);
		System.out.println(m);
	}

	public static void makeArray(String json) {
		Gson g = new Gson();
		MovieVO[] m = g.fromJson(json, MovieVO[].class);

		for (MovieVO mvo : m) {
			System.out.println(mvo);

		}
	}
}

// 영화 (String)
/*
 * <movie> <title>범죄도시</title> <actor>마동석</actor> <price>14000</price>
 * <loc>CGV</loc> <time>1:30</time> </movie>
 * 
 * 
 * {"title":"범죄도시","actor":"마동석","price":"14000","loc":"CGV","time":"1:30"}
 * 
 */

package java0715;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ex_Basic26 {

	public static void main(String[] args) {

		// JSoup API(HTML Parser)
		String url = "https://sum.su.or.kr:8888/bible/today";
		// Java(Client) ---- 요청(request) ---> sum.su.or.kr(Server)
		// GET, POST
		// <예외처리>
		try {
			Document doc = Jsoup.connect(url).get();
	    //  System.out.println(doc.toString());
			
			Element bt = doc.select(".bible_text").first();
			System.out.println(bt.text());
			
			Element bbox = doc.select(".bibleinfo_box").first();
			System.out.println(bbox.text());
			
			Elements liList = doc.select(".body_list > li");
			for(Element li : liList) {
				String num = li.select(".num").first().text();
				String info = li.select(".info").first().text();
				System.out.println(num+"절 : "+info);
			}
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외메세지 출력

		}

	}

}

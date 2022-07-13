package java0713;

import java0712.MovieVO;

public class ex14_Basic16 {

	public static void main(String[] args) {
		
		MovieVO[] m=new MovieVO[3];
		m[0] = new MovieVO("범죄도시","마동석","CGV","18:30",13000);
		m[1] = new MovieVO("신과함께","하정우","CGV","20:40",18000);
		m[2] = new MovieVO("마블-엔드게임","아이언맨","CGV","13:15",10000);
		
		// 영화제목을 기준으로 오름차순 정렬하여 출력하시오
		selectionSort(m);
		for(MovieVO mvo : m) {
			System.out.println(mvo);
		}

	}
	public static void selectionSort(MovieVO[] m) {
		for(int i = 0; i<m.length; i++) {
			for(int j=i+1; j<m.length; j++) {
				if(m[i].getName().compareTo(m[j].getName())>0) {
					MovieVO tmp;
					tmp=m[i];
					m[i]=m[j];
					m[j]=tmp;
				}
			}
		}
		
	}
	

}

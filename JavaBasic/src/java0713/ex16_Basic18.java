package java0713;

import java0712.MovieVO;

public class ex16_Basic18 {

	public static void main(String[] args) {
		MovieVO[] m = new MovieVO[3];
		m[0] = new MovieVO("범죄도시", "마동석", "CGV", "18:30", 13000);
		m[1] = new MovieVO("신과함께", "하정우", "CGV", "20:40", 18000);
		m[2] = new MovieVO("마블-엔드게임", "아이언맨", "CGV", "13:15", 10000);

		// 탑건의 영화 정보를 검색하세요
		String title = "신과함께";
		selectionSort(m);
		
		int index = binarySearch(m, title);
		if (index != -1) {
			System.out.println(m[index]);
		} else {
			System.out.println("검색에 실패하셨습니다");
		}

	}

	public static int binarySearch(MovieVO[] m, String title) {
		// 이진검색
		int low = 0;
		int high = m.length - 1;
		int middle;
		int index = -1;
		while (low <= high) {
			middle = (low + high) / 2;
			if (m[middle].getName().equals(title)) {
				index = middle;
				break;
			} else if (m[middle].getName().compareTo(title) < 0) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		return index;
		
	}

	public static void selectionSort(MovieVO[] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (m[i].getName().compareTo(m[j].getName()) > 0) {
					MovieVO tmp;
					tmp = m[i];
					m[i] = m[j];
					m[j] = tmp;
				}
			}
		}

	}
}

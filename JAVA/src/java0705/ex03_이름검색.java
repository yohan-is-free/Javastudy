package java0705;

import java.util.Scanner;

public class ex03_이름검색 {

	public static void main(String[] args) {
		// 1, 사람 이름으로 초기화된 배열 만들기
		String[] names = {"요한", "수진", "해도", "수현", "병관", "성우"};
		
		// 2. Scanner를 이용해 검색할 사람 이름을 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 검색하세요 >> ");
		String input = sc.next();
		
		boolean a = false; // 상태변수
		
		// 3. 해당 이름이 존재하는 인덱스를 출력
		for(int i=0; i<names.length; i++) {
			if(input.equals(names[i])) {
				System.out.println(input+"님은 "+(i+1)+"번째 인덱스에 저장되어 있습니다.");
				a = true;
				break;
			}					
		}
		// 4. 만약, 해당 이름이 배열에 없다면, "검색결과가 없습니다" 라는 멘트출력
		if(a == false) {
			System.out.println("검색결과가 없습니다.");
		}

	}

}

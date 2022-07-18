package java0718;

import kr.ani.oop2.Radio;
import kr.ani.oop2.RemoCon;
import kr.ani.oop2.TV;

public class OOP_09 {
	public static void main(String[] args){
		// RemoCon으로 TV를 동작시키시오
		// 1. 객체를 생성 할 수 없다
		// 2. upcasting으로 객체를 생성할 것
		// 3. 100% 다형성을 보장한다
		// 4. 서로 다른 기능의 클래스의 공통을 묶을 때 사용
		// 5. 추상메소드 + final static 멤버변수(상수)
		RemoCon rc = new TV();
		rc.chDown();
		rc.chUp();
		rc.internet();
		
		System.out.println();
		
		rc = new Radio();
		rc.chDown();
		rc.chUp();
		rc.internet();
		
	}
}

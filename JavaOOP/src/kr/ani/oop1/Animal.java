package kr.ani.oop1;
// 일반 클래스 -> 추상 클래스
public abstract class Animal {
	
	public abstract void eat(); // 추상메소드 -> 반드시 자식
	// 모든 동물들의 공통 동작
	// 구현클래스
	
	public void move() {
		System.out.println("무리를 지어 이동한다");
	}
}

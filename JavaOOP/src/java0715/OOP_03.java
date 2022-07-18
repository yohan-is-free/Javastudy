package java0715;

import kr.ani.oop1.Animal;
import kr.ani.oop1.Cat;
import kr.ani.oop1.Dog;

public class OOP_03 {

	public static void main(String[] args) {
		
		// 만약, Dog클래스를 다른 사람에게 받아서 동작을 시키는 경우
		// Dog.java, Dog.class
		// Animal.java, Animal.class
		//    |eat() {?}
		//    |
		//    |->Dog class(동작방식을 모른다)
		//    |eat() {개처럼}
		Animal g;
		
		g = new Dog(); // 자동형변환 (upcasting)
		g.eat();
		
		g=new Cat();
		g.eat();
		// *다형성*
		// 상위클래스가 동일한 메세지로
		// 하위클래스를 서로 다르게 동작시키는 객체지향 원리
		
		
	}

}

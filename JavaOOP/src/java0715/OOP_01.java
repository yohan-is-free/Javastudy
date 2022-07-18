package java0715;

import kr.ani.oop1.Cat;
import kr.ani.oop1.Dog;

public class OOP_01 {

	public static void main(String[] args) {
		
		// 상속 - 클래스를 어떻게 설계하는것이 가장 효율성이 있을까?
		// 설계 : 1. 수평적설계,  2. 수직적설계(상속)
		// 	  	 - 코드의 중복,     유지보수가 어렵다
		//       - 재활용, 확장성, 편리성
		// Dog의 eat()를 구동시켜보자
		Dog d = new Dog();
		d.eat();
		
		// Cat의 eat()를 구동시켜보자
		Cat c =new Cat();
		c.eat();
		c.night();
		
	}

}

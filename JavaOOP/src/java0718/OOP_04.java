package java0718;

import kr.ani.oop1.Animal;
import kr.ani.oop1.Cat;
import kr.ani.oop1.Dog;

public class OOP_04 {

	public static void main(String[] args) {
		// Animal [Dog.class, Cat.class]
		// eat(){?} - eat(){개}   eat(){고}
		// 객체생성(new + 생성자)
		// upcasting으로 객체를 생성
		Animal ani = new Dog();
		ani.eat();
		
		ani=new Cat();
		ani.eat();
		// downcasting(다운캐스팅)
		((Cat) ani).night();
		
	}

}

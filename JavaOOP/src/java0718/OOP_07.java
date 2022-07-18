package java0718;

import kr.ani.oop1.Animal;
import kr.ani.oop1.Cat;
import kr.ani.oop1.Dog;

public class OOP_07 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		// display()라는 메소드에서 eat()를 동작시키시오
		display(d);
		display(c);

	}
	//                         2. 다형성 인수
	public static void display(Animal ani) {
		ani.eat();
		if(ani instanceof Cat) {
			((Cat)ani).night();
		}
	}
	public static void display(Object ani) {
		((Animal)ani).eat();
		if(ani instanceof Cat) {
			((Cat)ani).night();
		}
	}

}

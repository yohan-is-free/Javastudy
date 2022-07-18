package java0718;

import kr.ani.oop1.Animal;
import kr.ani.oop1.Cat;
import kr.ani.oop1.Dog;

public class OOP_05 {
	public static void main(String[] args) {
		
		// 다형성의 활용 - 1
		// Dog, Cat을 2마리를 저장할 [배열]을 선언하시오
		
		// 다형성 배열
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
//		ani[0].eat();
//		ani[1].eat();
		
		// 반목문 처리
		for(int i=0; i<ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {  // 만약 ani[i]가 Cat인 경우에만
				((Cat)ani[i]).night();
			}
		}
	}
}

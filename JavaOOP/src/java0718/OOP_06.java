package java0718;

import kr.ani.oop1.Animal;
import kr.ani.oop1.Cat;
import kr.ani.oop1.Dog;

public class OOP_06 {

	public static void main(String[] args) {
		// Dog, Cat 2마리를 저장할 [배열]을 선언하시오
		
		Object[] obj = new Object[2];
		obj[0] = new Dog();
		obj[1] = new Cat();
		
		for(int i=0;i<obj.length;i++) {
			if(obj[i] instanceof Cat) {
				((Animal)obj[i]).eat();
			}else if(obj[i] instanceof Dog) {
				((Dog)obj[i]).eat();
			}
		}

	}

}

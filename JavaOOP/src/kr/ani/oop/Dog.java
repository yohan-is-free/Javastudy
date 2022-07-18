package kr.ani.oop;

public class Dog extends Animal {
	
	// Override(재정의, 부모 무시하기)
	public void eat() {
		System.out.println("강아지처럼 와구와구 먹다");
	}
}

package kr.ani.oop;

public class Cat extends Animal {
	

	@Override
	public void eat() {
		System.out.println("고양이처럼 욤욤 먹다");
	}

	public void night() {
		System.out.println("밤에 눈에서 불이 나온다");
	}
}

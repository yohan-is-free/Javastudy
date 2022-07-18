package kr.ani.oop2;

public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("라디오 채널 업");

		
	}

	@Override
	public void chDown() {
		System.out.println("라디오 채널 다운");

		
	}
	
	@Override
	public void internet() {
		System.out.println("Radio의 인터넷은 작동 불가");

		
	}

}

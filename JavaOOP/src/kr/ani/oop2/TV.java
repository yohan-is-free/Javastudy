package kr.ani.oop2;

public class TV implements RemoCon{

	int currCH = 5;  // ~10 -> 1+
	
	@Override
	public void chUp() {
		if(currCH < RemoCon.MAXCH) {
			currCH++;
			System.out.println("티비 채널 업 : "+currCH);
		}else {
			currCH=1;
		}
		
	}

	@Override
	public void chDown() {
		System.out.println("티비 채널 다운");
		
	}

	@Override
	public void internet() {
		System.out.println("TV의 인터넷이 작동 중");
		
	}
}

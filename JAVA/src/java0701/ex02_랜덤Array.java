package java0701;

import java.util.Random;

public class ex02_랜덤Array {

	public static void main(String[] args) {
		
		// 10칸 짜리 정수형 배열을 만들고
		// 1~20 사이의 난수로 초기화 시키기
		
		int[] ary = new int[10];
		
		Random rd = new Random(); // 랜덤수(난수)를 생성하는 데이터타입
		int num = rd.nextInt(20)+1;  // 1~20 숫자 생성 
		
		// 난수로 초기화하기
		for(int i=0; i<=9; i++) {
			ary[i] = rd.nextInt(20)+1;
			System.out.print(ary[i]+" ");
		}

	}

}

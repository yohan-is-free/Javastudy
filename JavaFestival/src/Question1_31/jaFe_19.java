package Question1_31;

public class jaFe_19 {

	public static void main(String[] args) {
		// (77*1)+(76*2)+(75*3)+...+(1*77)를 계산하여 결과를 출력
		
		int sum = 0;
		int s = 0;
		
		for(int i=1; i<78; i++) {
			s = (78-i)*i;
			sum += s;
		}
		System.out.println(sum);

	}

}

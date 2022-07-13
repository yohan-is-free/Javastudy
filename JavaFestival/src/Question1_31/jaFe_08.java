package Question1_31;

public class jaFe_08 {

	public static void main(String[] args) {
		// 1차원의 점들이 주어졌을 때
		// 그 중 가장 거리가 짧은 점(index)들을 출력하시오
		
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		
		int num1 = 0;
		int num2 = 0;
		
		int min = Math.abs(point[0]-point[1]);
		
		for(int j=0; j<point.length; j++) {
			
			for(int i=0; i<point.length; i++) {
				if(j != i) {
					if(min>Math.abs(point[i]-point[j])) {
						min = Math.abs(point[i]-point[j]);
						num1 = j;
						num2 = i;
					}

				}	
				
			}
			
		}
		System.out.println("result = [" + num1 + ", " + num2 + "]");

	}

}

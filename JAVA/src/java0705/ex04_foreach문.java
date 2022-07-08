package java0705;

public class ex04_foreach문 {

	public static void main(String[] args) {
		
		int[] arr = {5, 17, 56, 98, 100};
		
		for(int num : arr) {
			if(num%2==1) {
				System.out.println(num);				
			}
		}

	}

}

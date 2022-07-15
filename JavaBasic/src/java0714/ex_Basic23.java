package java0714;

public class ex_Basic23 {

	public static void main(String[] args) {
		
		String[] s= {"10","20","30","40","50"};
		// s배열의 총합을 구하시오(10+20+30+40+50=?)
		int sum = 0;
		for(String su:s) {
			sum+=Integer.parseInt(su);
		}
		System.out.println(sum);

	}

}

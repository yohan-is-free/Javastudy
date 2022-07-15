package java0714;

public class ex_Basic22 {

	public static void main(String[] args) {
		
		String a="100";
		String b="100";
		// a+b=200
		int v = Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println(v);  // "100100"
		
		int x=100;
		int y=100;
		// x+y="100100"
		String s= String.valueOf(x)+String.valueOf(y);
		System.out.println(s); // 100100
		

	}

}

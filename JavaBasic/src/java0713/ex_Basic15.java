package java0713;

public class ex_Basic15 {

	public static void main(String[] args) {
		
		String a="ABCDE";
		for(int i=0; i<a.length();i++) {
			System.out.println((char)a.charAt(i)+32);
		}
		String b = "12345";
		int sum = 0;
		for(int i=0; i<b.length(); i++) {
			sum+=b.charAt(i)-'0';
		}
		System.out.println(sum);

	}

}

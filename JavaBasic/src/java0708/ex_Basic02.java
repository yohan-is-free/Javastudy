package java0708;

public class ex_Basic02 {

	public static void main(String[] args) {
		
		int[] a = {4,3,1,2,5};
		// 1,2,3,4,5 : 오름차순 정렬(SORT)
		// selection sort(선택 정렬)
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1;j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int d:a) {
			System.out.print(d+" ");
		}
		
	}

}

package java0713;

public class ex15_Basic17 {

	public static void main(String[] args) {
		// 검색 : 순차검색, 블럭검색, 이진검색(*)
		// 이진검색 (Binary Search)
		
		//         0  1  2  3  4  5  6  7  8  9
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		
		int sdata=70; // 70이 몇번째 index에 존재하는가?
		
		int low = 0;
		int high = a.length-1;  // 9
		int middle;  // 6
		int index=-1;  // 실패(-1)
		while(low<=high) {
			middle=(low+high)/2;
			if(a[middle]==sdata) {
				index=middle;
				break;
			}else if(a[middle]<sdata) {
				low=middle+1;
			}else {
				high=middle-1;
			}
		}
		if(index!=-1) {
			System.out.println(sdata+" = "+index+" 위치에 존재함");
		}else {
			System.out.println("검색에 실패하셨습니다");
		}

	}

}

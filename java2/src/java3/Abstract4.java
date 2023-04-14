package java3;

import java.util.Arrays;
import java.util.Comparator;

public class Abstract4 {
/*
 	응용문제1. 1차 배열 값이 있습니다. 해당 배열값 리스트를 오름차순으로 정렬하며,
 	 해당 모든 배열값을 더하는 최종 결과값을 출력하는 코드를 작성하시오
 	 배열데이터 : 1 10 15 19 8 4 7 0 2 3 9 12
*/
	public static void main(String[] args) {
		ab5 ab = new ab5();
		ab.datalist();
		ab.result();
	}

}
class ab5 extends sum_total{
	@Override
	public void datalist() { 
		Integer arr[] = {1,10,15,19,8,4,7,0,2,3,9,12};
		//Arrays.sort(arr); 오름차순
		Arrays.sort(arr,Comparator.reverseOrder()); //내림차순
		System.out.println(Arrays.toString(arr)); 
		int w = 0;
		this.sum = 0;
		while(w < arr.length) {
			this.sum += arr[w];
			w++;
		}
	}
	@Override
	public void result() {
		System.out.println(this.sum);
	}
	
}
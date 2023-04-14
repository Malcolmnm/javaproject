package java1;

import java.util.Arrays;

public class Array8 {
	//배열 합치기 응용
	public static void main(String[] args) {
		/*
		 응용문제7.
		 데이터 배열 2가지가 있습니다. 해당 데이터 배열을 다음 결과처럼 값을 출력 시키시오.
		 1번 DATA : 대한민국 일본 중국 베트남 태국
		 2번 DATA : 40 35 70 55 32
		 결과출력 DATA
		 ["대한민국(40)"...] 
		 */
		String a[] = new String[5];
		String b[] = {"대한민국", "일본", "중국", "베트남", "태국"};
		int c[] = {40,35,70,55,32};
		int w = 0;
		while(w < 5) {
			a[w] = b[w]+"("+c[w]+")";
			//a[w] = b[w]+"("+String.valueOf(c[w])+")";
			//a[w] = b[w]+"("+Integer.toString(c[w])+")";
			w++;
		}
		System.out.println(Arrays.toString(a));

	}

}

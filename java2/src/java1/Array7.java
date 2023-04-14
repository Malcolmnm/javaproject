package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		/*
		 	응용문제6.
		 	사용자가 상품을 검색합니다. 사용자가 검색한 내용을 배열로 저장 되도록 하십시오.
		 	예시)
		 	상품검색 : 선풍기
		 	상품검색 : 냉장고
		 	상품검색 : 모니터
		 	상품검색 : 검색종료
		 	[선풍기,냉장고,모니터,null,null,null,null];
		*/
		String a[] = new String[7];
		Scanner sc = new Scanner(System.in);
		int w = 0;
		System.out.printf("상품검색 : ");
		for(String f : a) {
			String select = sc.nextLine().intern();
			if(select=="검색종료") {
				//Arrays.toString : 숫자,문자,소수[] 현재 배열 변수값을 출력하는 함수 입니다.
				System.out.println(Arrays.toString(a));
				break;
			}
			else{System.out.println("상품검색 :");
				a[w] = select;
				w++;
			}
		}
		sc.close();

	}

}
